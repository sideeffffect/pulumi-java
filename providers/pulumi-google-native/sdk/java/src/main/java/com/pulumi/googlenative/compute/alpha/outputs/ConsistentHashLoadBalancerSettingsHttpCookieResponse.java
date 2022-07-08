// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.DurationResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConsistentHashLoadBalancerSettingsHttpCookieResponse {
    /**
     * @return Name of the cookie.
     * 
     */
    private final String name;
    /**
     * @return Path to set for the cookie.
     * 
     */
    private final String path;
    /**
     * @return Lifetime of the cookie.
     * 
     */
    private final DurationResponse ttl;

    @CustomType.Constructor
    private ConsistentHashLoadBalancerSettingsHttpCookieResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("ttl") DurationResponse ttl) {
        this.name = name;
        this.path = path;
        this.ttl = ttl;
    }

    /**
     * @return Name of the cookie.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Path to set for the cookie.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Lifetime of the cookie.
     * 
     */
    public DurationResponse ttl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistentHashLoadBalancerSettingsHttpCookieResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String path;
        private DurationResponse ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistentHashLoadBalancerSettingsHttpCookieResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttl = defaults.ttl;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder ttl(DurationResponse ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }        public ConsistentHashLoadBalancerSettingsHttpCookieResponse build() {
            return new ConsistentHashLoadBalancerSettingsHttpCookieResponse(name, path, ttl);
        }
    }
}
