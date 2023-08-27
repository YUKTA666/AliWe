package com.app.service;

import java.util.List;

import com.app.dto.StreamDTO;
import com.app.entity.Engineer;
import com.app.entity.Stream;

public interface IStreamService {
	List<Engineer> getAllEngineersInStreamById(Long id);
	List<Stream> getAllStreams();
	Stream createStream(StreamDTO stream);
    Stream getStreamById(Long id);
    Stream updateStream(Long id, Stream stream);
    void deleteStream(Long id);
}
