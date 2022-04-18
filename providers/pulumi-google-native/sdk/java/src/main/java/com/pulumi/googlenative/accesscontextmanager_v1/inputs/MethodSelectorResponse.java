// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An allowed method or permission of a service specified in ApiOperation.
 * 
 */
public final class MethodSelectorResponse extends com.pulumi.resources.InvokeArgs {

    public static final MethodSelectorResponse Empty = new MethodSelectorResponse();

    /**
     * Value for `method` should be a valid method name for the corresponding `service_name` in ApiOperation. If `*` used as value for `method`, then ALL methods and permissions are allowed.
     * 
     */
    @Import(name="method", required=true)
      private final String method;

    public String method() {
        return this.method;
    }

    /**
     * Value for `permission` should be a valid Cloud IAM permission for the corresponding `service_name` in ApiOperation.
     * 
     */
    @Import(name="permission", required=true)
      private final String permission;

    public String permission() {
        return this.permission;
    }

    public MethodSelectorResponse(
        String method,
        String permission) {
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.permission = Objects.requireNonNull(permission, "expected parameter 'permission' to be non-null");
    }

    private MethodSelectorResponse() {
        this.method = null;
        this.permission = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String method;
        private String permission;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.permission = defaults.permission;
        }

        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder permission(String permission) {
            this.permission = Objects.requireNonNull(permission);
            return this;
        }        public MethodSelectorResponse build() {
            return new MethodSelectorResponse(method, permission);
        }
    }
}
