// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.OperationErrorResponse;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.OperationWarningsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents an Operation resource. Google Compute Engine has three Operation resources: * [Global](/compute/docs/reference/rest/{$api_version}/globalOperations) * [Regional](/compute/docs/reference/rest/{$api_version}/regionOperations) * [Zonal](/compute/docs/reference/rest/{$api_version}/zoneOperations) You can use an operation resource to manage asynchronous API requests. For more information, read Handling API responses. Operations can be global, regional or zonal. - For global operations, use the `globalOperations` resource. - For regional operations, use the `regionOperations` resource. - For zonal operations, use the `zonalOperations` resource. For more information, read Global, Regional, and Zonal Resources.
 * 
 */
public final class OperationResponse extends com.pulumi.resources.InvokeArgs {

    public static final OperationResponse Empty = new OperationResponse();

    /**
     * The value of `requestId` if you provided it in the request. Not present otherwise.
     * 
     */
    @Import(name="clientOperationId", required=true)
      private final String clientOperationId;

    public String clientOperationId() {
        return this.clientOperationId;
    }

    /**
     * A textual description of the operation, which is set when the operation is created.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * The time that this operation was completed. This value is in RFC3339 text format.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * If errors are generated during processing of the operation, this field will be populated.
     * 
     */
    @Import(name="error", required=true)
      private final OperationErrorResponse error;

    public OperationErrorResponse error() {
        return this.error;
    }

    /**
     * If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`.
     * 
     */
    @Import(name="httpErrorMessage", required=true)
      private final String httpErrorMessage;

    public String httpErrorMessage() {
        return this.httpErrorMessage;
    }

    /**
     * If the operation fails, this field contains the HTTP error status code that was returned. For example, a `404` means the resource was not found.
     * 
     */
    @Import(name="httpErrorStatusCode", required=true)
      private final Integer httpErrorStatusCode;

    public Integer httpErrorStatusCode() {
        return this.httpErrorStatusCode;
    }

    /**
     * The time that this operation was requested. This value is in RFC3339 text format.
     * 
     */
    @Import(name="insertTime", required=true)
      private final String insertTime;

    public String insertTime() {
        return this.insertTime;
    }

    /**
     * Type of the resource. Always `compute#operation` for Operation resources.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Name of the operation.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * An ID that represents a group of operations, such as when a group of operations results from a `bulkInsert` API request.
     * 
     */
    @Import(name="operationGroupId", required=true)
      private final String operationGroupId;

    public String operationGroupId() {
        return this.operationGroupId;
    }

    /**
     * The type of operation, such as `insert`, `update`, or `delete`, and so on.
     * 
     */
    @Import(name="operationType", required=true)
      private final String operationType;

    public String operationType() {
        return this.operationType;
    }

    /**
     * An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of operations. This should not be used to guess when the operation will be complete. This number should monotonically increase as the operation progresses.
     * 
     */
    @Import(name="progress", required=true)
      private final Integer progress;

    public Integer progress() {
        return this.progress;
    }

    /**
     * The URL of the region where the operation resides. Only applicable when performing regional operations.
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    /**
     * Server-defined URL for the resource.
     * 
     */
    @Import(name="selfLink", required=true)
      private final String selfLink;

    public String selfLink() {
        return this.selfLink;
    }

    /**
     * The time that this operation was started by the server. This value is in RFC3339 text format.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    /**
     * An optional textual description of the current status of the operation.
     * 
     */
    @Import(name="statusMessage", required=true)
      private final String statusMessage;

    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * The unique target ID, which identifies a specific incarnation of the target resource.
     * 
     */
    @Import(name="targetId", required=true)
      private final String targetId;

    public String targetId() {
        return this.targetId;
    }

    /**
     * The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created from.
     * 
     */
    @Import(name="targetLink", required=true)
      private final String targetLink;

    public String targetLink() {
        return this.targetLink;
    }

    /**
     * User who requested the operation, for example: `user@example.com`.
     * 
     */
    @Import(name="user", required=true)
      private final String user;

    public String user() {
        return this.user;
    }

    /**
     * If warning messages are generated during processing of the operation, this field will be populated.
     * 
     */
    @Import(name="warnings", required=true)
      private final List<OperationWarningsItemResponse> warnings;

    public List<OperationWarningsItemResponse> warnings() {
        return this.warnings;
    }

    /**
     * The URL of the zone where the operation resides. Only applicable when performing per-zone operations.
     * 
     */
    @Import(name="zone", required=true)
      private final String zone;

    public String zone() {
        return this.zone;
    }

    public OperationResponse(
        String clientOperationId,
        String description,
        String endTime,
        OperationErrorResponse error,
        String httpErrorMessage,
        Integer httpErrorStatusCode,
        String insertTime,
        String kind,
        String name,
        String operationGroupId,
        String operationType,
        Integer progress,
        String region,
        String selfLink,
        String startTime,
        String status,
        String statusMessage,
        String targetId,
        String targetLink,
        String user,
        List<OperationWarningsItemResponse> warnings,
        String zone) {
        this.clientOperationId = Objects.requireNonNull(clientOperationId, "expected parameter 'clientOperationId' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.httpErrorMessage = Objects.requireNonNull(httpErrorMessage, "expected parameter 'httpErrorMessage' to be non-null");
        this.httpErrorStatusCode = Objects.requireNonNull(httpErrorStatusCode, "expected parameter 'httpErrorStatusCode' to be non-null");
        this.insertTime = Objects.requireNonNull(insertTime, "expected parameter 'insertTime' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operationGroupId = Objects.requireNonNull(operationGroupId, "expected parameter 'operationGroupId' to be non-null");
        this.operationType = Objects.requireNonNull(operationType, "expected parameter 'operationType' to be non-null");
        this.progress = Objects.requireNonNull(progress, "expected parameter 'progress' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusMessage = Objects.requireNonNull(statusMessage, "expected parameter 'statusMessage' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
        this.targetLink = Objects.requireNonNull(targetLink, "expected parameter 'targetLink' to be non-null");
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
        this.warnings = Objects.requireNonNull(warnings, "expected parameter 'warnings' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private OperationResponse() {
        this.clientOperationId = null;
        this.description = null;
        this.endTime = null;
        this.error = null;
        this.httpErrorMessage = null;
        this.httpErrorStatusCode = null;
        this.insertTime = null;
        this.kind = null;
        this.name = null;
        this.operationGroupId = null;
        this.operationType = null;
        this.progress = null;
        this.region = null;
        this.selfLink = null;
        this.startTime = null;
        this.status = null;
        this.statusMessage = null;
        this.targetId = null;
        this.targetLink = null;
        this.user = null;
        this.warnings = List.of();
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientOperationId;
        private String description;
        private String endTime;
        private OperationErrorResponse error;
        private String httpErrorMessage;
        private Integer httpErrorStatusCode;
        private String insertTime;
        private String kind;
        private String name;
        private String operationGroupId;
        private String operationType;
        private Integer progress;
        private String region;
        private String selfLink;
        private String startTime;
        private String status;
        private String statusMessage;
        private String targetId;
        private String targetLink;
        private String user;
        private List<OperationWarningsItemResponse> warnings;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.httpErrorMessage = defaults.httpErrorMessage;
    	      this.httpErrorStatusCode = defaults.httpErrorStatusCode;
    	      this.insertTime = defaults.insertTime;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.operationGroupId = defaults.operationGroupId;
    	      this.operationType = defaults.operationType;
    	      this.progress = defaults.progress;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.targetId = defaults.targetId;
    	      this.targetLink = defaults.targetLink;
    	      this.user = defaults.user;
    	      this.warnings = defaults.warnings;
    	      this.zone = defaults.zone;
        }

        public Builder clientOperationId(String clientOperationId) {
            this.clientOperationId = Objects.requireNonNull(clientOperationId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder error(OperationErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder httpErrorMessage(String httpErrorMessage) {
            this.httpErrorMessage = Objects.requireNonNull(httpErrorMessage);
            return this;
        }
        public Builder httpErrorStatusCode(Integer httpErrorStatusCode) {
            this.httpErrorStatusCode = Objects.requireNonNull(httpErrorStatusCode);
            return this;
        }
        public Builder insertTime(String insertTime) {
            this.insertTime = Objects.requireNonNull(insertTime);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operationGroupId(String operationGroupId) {
            this.operationGroupId = Objects.requireNonNull(operationGroupId);
            return this;
        }
        public Builder operationType(String operationType) {
            this.operationType = Objects.requireNonNull(operationType);
            return this;
        }
        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder targetLink(String targetLink) {
            this.targetLink = Objects.requireNonNull(targetLink);
            return this;
        }
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }
        public Builder warnings(List<OperationWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public Builder warnings(OperationWarningsItemResponse... warnings) {
            return warnings(List.of(warnings));
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public OperationResponse build() {
            return new OperationResponse(clientOperationId, description, endTime, error, httpErrorMessage, httpErrorStatusCode, insertTime, kind, name, operationGroupId, operationType, progress, region, selfLink, startTime, status, statusMessage, targetId, targetLink, user, warnings, zone);
        }
    }
}
