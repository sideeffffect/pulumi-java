// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetAppEngineRoutingArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobAppEngineHttpTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobAppEngineHttpTargetArgs Empty = new JobAppEngineHttpTargetArgs();

    /**
     * App Engine Routing setting for the job.
     * Structure is documented below.
     * 
     */
    @Import(name="appEngineRouting")
      private final @Nullable Output<JobAppEngineHttpTargetAppEngineRoutingArgs> appEngineRouting;

    public Output<JobAppEngineHttpTargetAppEngineRoutingArgs> appEngineRouting() {
        return this.appEngineRouting == null ? Codegen.empty() : this.appEngineRouting;
    }

    /**
     * HTTP request body.
     * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
     * It is an error to set body on a job with an incompatible HttpMethod.
     * A base64-encoded string.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> body() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * This map contains the header field names and values.
     * Repeated headers are not supported, but a header value can contain commas.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<Map<String,String>> headers;

    public Output<Map<String,String>> headers() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * Which HTTP method to use for the request.
     * 
     */
    @Import(name="httpMethod")
      private final @Nullable Output<String> httpMethod;

    public Output<String> httpMethod() {
        return this.httpMethod == null ? Codegen.empty() : this.httpMethod;
    }

    /**
     * The relative URI.
     * The relative URL must begin with "/" and must be a valid HTTP relative URL.
     * It can contain a path, query string arguments, and \# fragments.
     * If the relative URL is empty, then the root path "/" will be used.
     * No spaces are allowed, and the maximum length allowed is 2083 characters
     * 
     */
    @Import(name="relativeUri", required=true)
      private final Output<String> relativeUri;

    public Output<String> relativeUri() {
        return this.relativeUri;
    }

    public JobAppEngineHttpTargetArgs(
        @Nullable Output<JobAppEngineHttpTargetAppEngineRoutingArgs> appEngineRouting,
        @Nullable Output<String> body,
        @Nullable Output<Map<String,String>> headers,
        @Nullable Output<String> httpMethod,
        Output<String> relativeUri) {
        this.appEngineRouting = appEngineRouting;
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.relativeUri = Objects.requireNonNull(relativeUri, "expected parameter 'relativeUri' to be non-null");
    }

    private JobAppEngineHttpTargetArgs() {
        this.appEngineRouting = Codegen.empty();
        this.body = Codegen.empty();
        this.headers = Codegen.empty();
        this.httpMethod = Codegen.empty();
        this.relativeUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobAppEngineHttpTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobAppEngineHttpTargetAppEngineRoutingArgs> appEngineRouting;
        private @Nullable Output<String> body;
        private @Nullable Output<Map<String,String>> headers;
        private @Nullable Output<String> httpMethod;
        private Output<String> relativeUri;

        public Builder() {
    	      // Empty
        }

        public Builder(JobAppEngineHttpTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRouting = defaults.appEngineRouting;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.relativeUri = defaults.relativeUri;
        }

        public Builder appEngineRouting(@Nullable Output<JobAppEngineHttpTargetAppEngineRoutingArgs> appEngineRouting) {
            this.appEngineRouting = appEngineRouting;
            return this;
        }
        public Builder appEngineRouting(@Nullable JobAppEngineHttpTargetAppEngineRoutingArgs appEngineRouting) {
            this.appEngineRouting = Codegen.ofNullable(appEngineRouting);
            return this;
        }
        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public Builder httpMethod(@Nullable String httpMethod) {
            this.httpMethod = Codegen.ofNullable(httpMethod);
            return this;
        }
        public Builder relativeUri(Output<String> relativeUri) {
            this.relativeUri = Objects.requireNonNull(relativeUri);
            return this;
        }
        public Builder relativeUri(String relativeUri) {
            this.relativeUri = Output.of(Objects.requireNonNull(relativeUri));
            return this;
        }        public JobAppEngineHttpTargetArgs build() {
            return new JobAppEngineHttpTargetArgs(appEngineRouting, body, headers, httpMethod, relativeUri);
        }
    }
}
