package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.dto.response.BinaryContentResponse;
import com.sprint.mission.discodeit.vo.BinaryContentData;
import java.util.List;
import java.util.UUID;

public interface BinaryContentService {

  BinaryContentResponse create(BinaryContentData binaryContentData);

  BinaryContentResponse find(UUID binaryContentId);

  List<BinaryContentResponse> findAllByIdIn(List<UUID> binaryContentIds);

  void delete(UUID id);
}
