// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RoleRef {
    /**
     * APIGroup is the group for the resource being referenced
     * 
     */
    private final String apiGroup;
    /**
     * Kind is the type of resource being referenced
     * 
     */
    private final String kind;
    /**
     * Name is the name of resource being referenced
     * 
     */
    private final String name;

    @CustomType.Constructor
    private RoleRef(
        @CustomType.Parameter("apiGroup") String apiGroup,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
    }

    /**
     * APIGroup is the group for the resource being referenced
     * 
    */
    public String apiGroup() {
        return this.apiGroup;
    }
    /**
     * Kind is the type of resource being referenced
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Name is the name of resource being referenced
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiGroup;
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder apiGroup(String apiGroup) {
            this.apiGroup = Objects.requireNonNull(apiGroup);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public RoleRef build() {
            return new RoleRef(apiGroup, kind, name);
        }
    }
}
