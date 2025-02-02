// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicenetworking.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPeeredDnsDomainResult {
    private final String dnsSuffix;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String network;
    private final String parent;
    private final String project;
    private final String service;

    @CustomType.Constructor
    private GetPeeredDnsDomainResult(
        @CustomType.Parameter("dnsSuffix") String dnsSuffix,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("service") String service) {
        this.dnsSuffix = dnsSuffix;
        this.id = id;
        this.name = name;
        this.network = network;
        this.parent = parent;
        this.project = project;
        this.service = service;
    }

    public String dnsSuffix() {
        return this.dnsSuffix;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public String parent() {
        return this.parent;
    }
    public String project() {
        return this.project;
    }
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeredDnsDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dnsSuffix;
        private String id;
        private String name;
        private String network;
        private String parent;
        private String project;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeredDnsDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.parent = defaults.parent;
    	      this.project = defaults.project;
    	      this.service = defaults.service;
        }

        public Builder dnsSuffix(String dnsSuffix) {
            this.dnsSuffix = Objects.requireNonNull(dnsSuffix);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public GetPeeredDnsDomainResult build() {
            return new GetPeeredDnsDomainResult(dnsSuffix, id, name, network, parent, project, service);
        }
    }
}
