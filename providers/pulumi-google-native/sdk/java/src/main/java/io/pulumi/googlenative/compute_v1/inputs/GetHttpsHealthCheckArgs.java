// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHttpsHealthCheckArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHttpsHealthCheckArgs Empty = new GetHttpsHealthCheckArgs();

    @InputImport(name="httpsHealthCheck", required=true)
      private final String httpsHealthCheck;

    public String getHttpsHealthCheck() {
        return this.httpsHealthCheck;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetHttpsHealthCheckArgs(
        String httpsHealthCheck,
        @Nullable String project) {
        this.httpsHealthCheck = Objects.requireNonNull(httpsHealthCheck, "expected parameter 'httpsHealthCheck' to be non-null");
        this.project = project;
    }

    private GetHttpsHealthCheckArgs() {
        this.httpsHealthCheck = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHttpsHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpsHealthCheck;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHttpsHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpsHealthCheck = defaults.httpsHealthCheck;
    	      this.project = defaults.project;
        }

        public Builder httpsHealthCheck(String httpsHealthCheck) {
            this.httpsHealthCheck = Objects.requireNonNull(httpsHealthCheck);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetHttpsHealthCheckArgs build() {
            return new GetHttpsHealthCheckArgs(httpsHealthCheck, project);
        }
    }
}
