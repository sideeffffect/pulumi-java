// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionTargetHttpProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionTargetHttpProxyArgs Empty = new RegionTargetHttpProxyArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * URLs to networkservices.HttpFilter resources enabled for xDS clients using this configuration. For example, https://networkservices.googleapis.com/v1alpha1/projects/project/locations/ locationhttpFilters/httpFilter Only filters that handle outbound connection and stream events may be specified. These filters work in conjunction with a default set of HTTP filters that may already be configured by Traffic Director. Traffic Director will determine the final location of these filters within xDS configuration based on the name of the HTTP filter. If Traffic Director positions multiple filters at the same location, those filters will be in the same order as specified in this list. httpFilters only applies for loadbalancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details.
     * 
     */
    @Import(name="httpFilters")
      private final @Nullable Output<List<String>> httpFilters;

    public Output<List<String>> httpFilters() {
        return this.httpFilters == null ? Codegen.empty() : this.httpFilters;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
     */
    @Import(name="proxyBind")
      private final @Nullable Output<Boolean> proxyBind;

    public Output<Boolean> proxyBind() {
        return this.proxyBind == null ? Codegen.empty() : this.proxyBind;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * URL to the UrlMap resource that defines the mapping from URL to the BackendService.
     * 
     */
    @Import(name="urlMap")
      private final @Nullable Output<String> urlMap;

    public Output<String> urlMap() {
        return this.urlMap == null ? Codegen.empty() : this.urlMap;
    }

    public RegionTargetHttpProxyArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> httpFilters,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> proxyBind,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<String> urlMap) {
        this.description = description;
        this.httpFilters = httpFilters;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.urlMap = urlMap;
    }

    private RegionTargetHttpProxyArgs() {
        this.description = Codegen.empty();
        this.httpFilters = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.proxyBind = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.urlMap = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionTargetHttpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> httpFilters;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> proxyBind;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionTargetHttpProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.httpFilters = defaults.httpFilters;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder httpFilters(@Nullable Output<List<String>> httpFilters) {
            this.httpFilters = httpFilters;
            return this;
        }
        public Builder httpFilters(@Nullable List<String> httpFilters) {
            this.httpFilters = Codegen.ofNullable(httpFilters);
            return this;
        }
        public Builder httpFilters(String... httpFilters) {
            return httpFilters(List.of(httpFilters));
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
        public Builder proxyBind(@Nullable Output<Boolean> proxyBind) {
            this.proxyBind = proxyBind;
            return this;
        }
        public Builder proxyBind(@Nullable Boolean proxyBind) {
            this.proxyBind = Codegen.ofNullable(proxyBind);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder urlMap(@Nullable Output<String> urlMap) {
            this.urlMap = urlMap;
            return this;
        }
        public Builder urlMap(@Nullable String urlMap) {
            this.urlMap = Codegen.ofNullable(urlMap);
            return this;
        }        public RegionTargetHttpProxyArgs build() {
            return new RegionTargetHttpProxyArgs(description, httpFilters, name, project, proxyBind, region, requestId, urlMap);
        }
    }
}
