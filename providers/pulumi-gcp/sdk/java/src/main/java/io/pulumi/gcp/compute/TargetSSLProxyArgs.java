// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetSSLProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetSSLProxyArgs Empty = new TargetSSLProxyArgs();

    /**
     * A reference to the BackendService resource.
     * 
     */
    @Import(name="backendService", required=true)
      private final Output<String> backendService;

    public Output<String> backendService() {
        return this.backendService;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Specifies the type of proxy header to append before sending data to
     * the backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    @Import(name="proxyHeader")
      private final @Nullable Output<String> proxyHeader;

    public Output<String> proxyHeader() {
        return this.proxyHeader == null ? Codegen.empty() : this.proxyHeader;
    }

    /**
     * A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one
     * SSL certificate must be specified.
     * 
     */
    @Import(name="sslCertificates", required=true)
      private final Output<List<String>> sslCertificates;

    public Output<List<String>> sslCertificates() {
        return this.sslCertificates;
    }

    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetSslProxy resource. If not set, the TargetSslProxy
     * resource will not have any SSL policy configured.
     * 
     */
    @Import(name="sslPolicy")
      private final @Nullable Output<String> sslPolicy;

    public Output<String> sslPolicy() {
        return this.sslPolicy == null ? Codegen.empty() : this.sslPolicy;
    }

    public TargetSSLProxyArgs(
        Output<String> backendService,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> proxyHeader,
        Output<List<String>> sslCertificates,
        @Nullable Output<String> sslPolicy) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyHeader = proxyHeader;
        this.sslCertificates = Objects.requireNonNull(sslCertificates, "expected parameter 'sslCertificates' to be non-null");
        this.sslPolicy = sslPolicy;
    }

    private TargetSSLProxyArgs() {
        this.backendService = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.proxyHeader = Codegen.empty();
        this.sslCertificates = Codegen.empty();
        this.sslPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetSSLProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backendService;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> proxyHeader;
        private Output<List<String>> sslCertificates;
        private @Nullable Output<String> sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetSSLProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder backendService(Output<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public Builder backendService(String backendService) {
            this.backendService = Output.of(Objects.requireNonNull(backendService));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder proxyHeader(@Nullable Output<String> proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }
        public Builder proxyHeader(@Nullable String proxyHeader) {
            this.proxyHeader = Codegen.ofNullable(proxyHeader);
            return this;
        }
        public Builder sslCertificates(Output<List<String>> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }
        public Builder sslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Output.of(Objects.requireNonNull(sslCertificates));
            return this;
        }
        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }
        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }
        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Codegen.ofNullable(sslPolicy);
            return this;
        }        public TargetSSLProxyArgs build() {
            return new TargetSSLProxyArgs(backendService, description, name, project, proxyHeader, sslCertificates, sslPolicy);
        }
    }
}
