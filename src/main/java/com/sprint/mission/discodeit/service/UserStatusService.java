package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.dto.response.UserStatusResponse;
import java.util.List;
import java.util.UUID;

public interface UserStatusService {

  /**
   * 사용자 상태 생성
   *
   * @param userId 사용자 ID
   * @return 생성된 사용자 상태
   */
  UserStatusResponse create(UUID userId);

  /**
   * ID로 사용자 상태 조회
   *
   * @param userStatusId 사용자 상태 ID
   * @return 조회된 사용자 상태
   */
  UserStatusResponse find(UUID userStatusId);

  /**
   * userId로 사용자 상태 조회
   *
   * @param userId 사용자 ID
   * @return 조회된 사용자 상태
   */
  UserStatusResponse findByUserId(UUID userId);

  /**
   * 전체 사용자 상태 조회
   *
   * @return 사용자 상태 목록
   */
  List<UserStatusResponse> findAll();

  /**
   * 사용자 상태 업데이트
   *
   * @param userId 사용자 ID
   * @return 업데이트된 사용자 상태
   */
  UserStatusResponse update(UUID userId);

  /**
   * userId로 사용자 상태 업데이트
   *
   * @param userId 사용자 ID
   * @return 업데이트된 사용자 상태
   */
  UserStatusResponse updateByUserId(UUID userId);

  /**
   * 사용자 상태 삭제
   *
   * @param userStatusId 사용자 상태 ID
   */
  void delete(UUID userStatusId);
}

