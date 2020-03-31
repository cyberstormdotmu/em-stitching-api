package uk.gov.hmcts.reform.em.stitching.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import uk.gov.hmcts.reform.em.stitching.service.dto.DocumentTaskDTO;

import java.util.Optional;

/**
 * Service Interface for managing DocumentTask.
 */
public interface DocumentTaskService {

    /**
     * Save a documentTask.
     *
     * @param documentTaskDTO the entity to save
     * @return the persisted entity
     */
    DocumentTaskDTO save(DocumentTaskDTO documentTaskDTO);

    /**
     * Get the "id" documentTask.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<DocumentTaskDTO> findOne(Long id);

    /**
     * Get the json documentTask.
     *
     * @param documentTaskDTO request body
     * @return the pretty Json
     */
    String requestBodyJson(DocumentTaskDTO documentTaskDTO) throws JsonProcessingException;

}
