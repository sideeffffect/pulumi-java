// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.ServiceMeshTypeResponse;
import java.lang.String;
import java.util.Objects;


/**
 * AnalysisMessageBase describes some common information that is needed for all messages.
 * 
 */
public final class ServiceMeshAnalysisMessageBaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceMeshAnalysisMessageBaseResponse Empty = new ServiceMeshAnalysisMessageBaseResponse();

    /**
     * A url pointing to the Service Mesh or Istio documentation for this specific error type.
     * 
     */
    @InputImport(name="documentationUrl", required=true)
      private final String documentationUrl;

    public String getDocumentationUrl() {
        return this.documentationUrl;
    }

    /**
     * Represents how severe a message is.
     * 
     */
    @InputImport(name="level", required=true)
      private final String level;

    public String getLevel() {
        return this.level;
    }

    /**
     * Represents the specific type of a message.
     * 
     */
    @InputImport(name="type", required=true)
      private final ServiceMeshTypeResponse type;

    public ServiceMeshTypeResponse getType() {
        return this.type;
    }

    public ServiceMeshAnalysisMessageBaseResponse(
        String documentationUrl,
        String level,
        ServiceMeshTypeResponse type) {
        this.documentationUrl = Objects.requireNonNull(documentationUrl, "expected parameter 'documentationUrl' to be non-null");
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServiceMeshAnalysisMessageBaseResponse() {
        this.documentationUrl = null;
        this.level = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshAnalysisMessageBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentationUrl;
        private String level;
        private ServiceMeshTypeResponse type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceMeshAnalysisMessageBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentationUrl = defaults.documentationUrl;
    	      this.level = defaults.level;
    	      this.type = defaults.type;
        }

        public Builder documentationUrl(String documentationUrl) {
            this.documentationUrl = Objects.requireNonNull(documentationUrl);
            return this;
        }

        public Builder level(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder type(ServiceMeshTypeResponse type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ServiceMeshAnalysisMessageBaseResponse build() {
            return new ServiceMeshAnalysisMessageBaseResponse(documentationUrl, level, type);
        }
    }
}
