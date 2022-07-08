// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetArchiveDeploymentResult {
    /**
     * @return The time at which the Archive Deployment was created in milliseconds since the epoch.
     * 
     */
    private final String createdAt;
    /**
     * @return Input only. The Google Cloud Storage signed URL returned from GenerateUploadUrl and used to upload the Archive zip file.
     * 
     */
    private final String gcsUri;
    /**
     * @return User-supplied key-value pairs used to organize ArchiveDeployments. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Name of the Archive Deployment in the following format: `organizations/{org}/environments/{env}/archiveDeployments/{id}`.
     * 
     */
    private final String name;
    /**
     * @return A reference to the LRO that created this Archive Deployment in the following format: `organizations/{org}/operations/{id}`
     * 
     */
    private final String operation;
    /**
     * @return The time at which the Archive Deployment was updated in milliseconds since the epoch.
     * 
     */
    private final String updatedAt;

    @CustomType.Constructor
    private GetArchiveDeploymentResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("gcsUri") String gcsUri,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("operation") String operation,
        @CustomType.Parameter("updatedAt") String updatedAt) {
        this.createdAt = createdAt;
        this.gcsUri = gcsUri;
        this.labels = labels;
        this.name = name;
        this.operation = operation;
        this.updatedAt = updatedAt;
    }

    /**
     * @return The time at which the Archive Deployment was created in milliseconds since the epoch.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Input only. The Google Cloud Storage signed URL returned from GenerateUploadUrl and used to upload the Archive zip file.
     * 
     */
    public String gcsUri() {
        return this.gcsUri;
    }
    /**
     * @return User-supplied key-value pairs used to organize ArchiveDeployments. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Name of the Archive Deployment in the following format: `organizations/{org}/environments/{env}/archiveDeployments/{id}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A reference to the LRO that created this Archive Deployment in the following format: `organizations/{org}/operations/{id}`
     * 
     */
    public String operation() {
        return this.operation;
    }
    /**
     * @return The time at which the Archive Deployment was updated in milliseconds since the epoch.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArchiveDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String gcsUri;
        private Map<String,String> labels;
        private String name;
        private String operation;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArchiveDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.gcsUri = defaults.gcsUri;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder gcsUri(String gcsUri) {
            this.gcsUri = Objects.requireNonNull(gcsUri);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }        public GetArchiveDeploymentResult build() {
            return new GetArchiveDeploymentResult(createdAt, gcsUri, labels, name, operation, updatedAt);
        }
    }
}
