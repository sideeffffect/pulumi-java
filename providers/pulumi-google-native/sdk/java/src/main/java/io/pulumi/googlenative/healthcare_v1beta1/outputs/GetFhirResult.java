// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetFhirResult {
    /**
     * The HTTP Content-Type header value specifying the content type of the body.
     * 
     */
    private final String contentType;
    /**
     * The HTTP request/response body as raw binary.
     * 
     */
    private final String data;
    /**
     * Application specific response metadata. Must be set in the first response for streaming APIs.
     * 
     */
    private final List<Map<String,String>> extensions;

    @OutputCustomType.Constructor
    private GetFhirResult(
        @OutputCustomType.Parameter("contentType") String contentType,
        @OutputCustomType.Parameter("data") String data,
        @OutputCustomType.Parameter("extensions") List<Map<String,String>> extensions) {
        this.contentType = contentType;
        this.data = data;
        this.extensions = extensions;
    }

    /**
     * The HTTP Content-Type header value specifying the content type of the body.
     * 
    */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The HTTP request/response body as raw binary.
     * 
    */
    public String getData() {
        return this.data;
    }
    /**
     * Application specific response metadata. Must be set in the first response for streaming APIs.
     * 
    */
    public List<Map<String,String>> getExtensions() {
        return this.extensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFhirResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private String data;
        private List<Map<String,String>> extensions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFhirResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.data = defaults.data;
    	      this.extensions = defaults.extensions;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder extensions(List<Map<String,String>> extensions) {
            this.extensions = Objects.requireNonNull(extensions);
            return this;
        }
        public GetFhirResult build() {
            return new GetFhirResult(contentType, data, extensions);
        }
    }
}
