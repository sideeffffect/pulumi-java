// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExportResult {
    private final @Nullable String accepts;
    /**
     * The API Spec.
     * 
     */
    private final String body;
    /**
     * The content-disposition header value in the HTTP response.
     * 
     */
    private final String contentDisposition;
    /**
     * The content-type header value in the HTTP response.
     * 
     */
    private final String contentType;
    private final String exportType;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Map<String,String> parameters;
    private final String restApiId;
    private final String stageName;

    @OutputCustomType.Constructor
    private GetExportResult(
        @OutputCustomType.Parameter("accepts") @Nullable String accepts,
        @OutputCustomType.Parameter("body") String body,
        @OutputCustomType.Parameter("contentDisposition") String contentDisposition,
        @OutputCustomType.Parameter("contentType") String contentType,
        @OutputCustomType.Parameter("exportType") String exportType,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @OutputCustomType.Parameter("restApiId") String restApiId,
        @OutputCustomType.Parameter("stageName") String stageName) {
        this.accepts = accepts;
        this.body = body;
        this.contentDisposition = contentDisposition;
        this.contentType = contentType;
        this.exportType = exportType;
        this.id = id;
        this.parameters = parameters;
        this.restApiId = restApiId;
        this.stageName = stageName;
    }

    public Optional<String> getAccepts() {
        return Optional.ofNullable(this.accepts);
    }
    /**
     * The API Spec.
     * 
    */
    public String getBody() {
        return this.body;
    }
    /**
     * The content-disposition header value in the HTTP response.
     * 
    */
    public String getContentDisposition() {
        return this.contentDisposition;
    }
    /**
     * The content-type header value in the HTTP response.
     * 
    */
    public String getContentType() {
        return this.contentType;
    }
    public String getExportType() {
        return this.exportType;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public String getRestApiId() {
        return this.restApiId;
    }
    public String getStageName() {
        return this.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accepts;
        private String body;
        private String contentDisposition;
        private String contentType;
        private String exportType;
        private String id;
        private @Nullable Map<String,String> parameters;
        private String restApiId;
        private String stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepts = defaults.accepts;
    	      this.body = defaults.body;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentType = defaults.contentType;
    	      this.exportType = defaults.exportType;
    	      this.id = defaults.id;
    	      this.parameters = defaults.parameters;
    	      this.restApiId = defaults.restApiId;
    	      this.stageName = defaults.stageName;
        }

        public Builder accepts(@Nullable String accepts) {
            this.accepts = accepts;
            return this;
        }

        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = Objects.requireNonNull(contentDisposition);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder exportType(String exportType) {
            this.exportType = Objects.requireNonNull(exportType);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder restApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }

        public Builder stageName(String stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }
        public GetExportResult build() {
            return new GetExportResult(accepts, body, contentDisposition, contentType, exportType, id, parameters, restApiId, stageName);
        }
    }
}
