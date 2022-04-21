// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Compute role against which events will be raised.
 * 
 */
public final class RoleSinkInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleSinkInfoArgs Empty = new RoleSinkInfoArgs();

    /**
     * Compute role ID.
     * 
     */
    @Import(name="roleId", required=true)
    private Output<String> roleId;

    public Output<String> roleId() {
        return this.roleId;
    }

    private RoleSinkInfoArgs() {}

    private RoleSinkInfoArgs(RoleSinkInfoArgs $) {
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleSinkInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleSinkInfoArgs $;

        public Builder() {
            $ = new RoleSinkInfoArgs();
        }

        public Builder(RoleSinkInfoArgs defaults) {
            $ = new RoleSinkInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public RoleSinkInfoArgs build() {
            $.roleId = Objects.requireNonNull($.roleId, "expected parameter 'roleId' to be non-null");
            return $;
        }
    }

}
