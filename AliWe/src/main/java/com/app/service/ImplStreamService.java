package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excceptions.ResourceNotFoundException;
import com.app.dto.StreamDTO;
import com.app.entity.Engineer;
import com.app.entity.Stream;
import com.app.repository.IStreamRepository;

@Service
@Transactional
public class ImplStreamService implements IStreamService {

	@Autowired
	private IStreamRepository streamRepo;
	
	public ImplStreamService(IStreamRepository streamRepo) {
		this.streamRepo = streamRepo;
	}

	@Override
	public List<Engineer> getAllEngineersInStreamById(Long id) {
		Stream stream = streamRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Stream not found"));
		return stream.getEngineers();
	}

	@Override
	public Stream createStream(StreamDTO streamdto) {
		Stream stream = new Stream(streamdto.getStreamName(), streamdto.getQualifyingMarksPCM());
		return streamRepo.save(stream);
	}

	@Override
	public Stream getStreamById(Long id) {
		return streamRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Stream not found"));
	}

	@Override
	public Stream updateStream(Long id, Stream stream) {
		Stream existingStream = streamRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Stream not found"));
		existingStream.setStreamName(stream.getStreamName());
		existingStream.setQualifyingMarksPCM(stream.getQualifyingMarksPCM());
		return streamRepo.save(existingStream);
	}

	@Override
	public void deleteStream(Long id) {
		streamRepo.deleteById(id);
	}

	@Override
	public List<Stream> getAllStreams() {
		return streamRepo.findAll();
	}

}
