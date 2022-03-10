// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * UrlMaps A host-matching rule for a URL. If matched, will use the named PathMatcher to select the BackendService.
 * 
 */
public final class HostRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final HostRuleResponse Empty = new HostRuleResponse();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @InputImport(name="hosts", required=true)
      private final List<String> hosts;

    public List<String> getHosts() {
        return this.hosts;
    }

    /**
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * 
     */
    @InputImport(name="pathMatcher", required=true)
      private final String pathMatcher;

    public String getPathMatcher() {
        return this.pathMatcher;
    }

    public HostRuleResponse(
        String description,
        List<String> hosts,
        String pathMatcher) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.pathMatcher = Objects.requireNonNull(pathMatcher, "expected parameter 'pathMatcher' to be non-null");
    }

    private HostRuleResponse() {
        this.description = null;
        this.hosts = List.of();
        this.pathMatcher = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<String> hosts;
        private String pathMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(HostRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hosts = defaults.hosts;
    	      this.pathMatcher = defaults.pathMatcher;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder hosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder pathMatcher(String pathMatcher) {
            this.pathMatcher = Objects.requireNonNull(pathMatcher);
            return this;
        }
        public HostRuleResponse build() {
            return new HostRuleResponse(description, hosts, pathMatcher);
        }
    }
}
