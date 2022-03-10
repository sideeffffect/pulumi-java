// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationUrlDispatchRulesDispatchRule {
    /**
     * Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".
     * Defaults to matching all domains: "*".
     * 
     */
    private final @Nullable String domain;
    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.
     * The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
     */
    private final String path;
    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.
     * The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor
    private ApplicationUrlDispatchRulesDispatchRule(
        @OutputCustomType.Parameter("domain") @Nullable String domain,
        @OutputCustomType.Parameter("path") String path,
        @OutputCustomType.Parameter("service") String service) {
        this.domain = domain;
        this.path = path;
        this.service = service;
    }

    /**
     * Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".
     * Defaults to matching all domains: "*".
     * 
    */
    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.
     * The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.
     * The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUrlDispatchRulesDispatchRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domain;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUrlDispatchRulesDispatchRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public ApplicationUrlDispatchRulesDispatchRule build() {
            return new ApplicationUrlDispatchRulesDispatchRule(domain, path, service);
        }
    }
}
