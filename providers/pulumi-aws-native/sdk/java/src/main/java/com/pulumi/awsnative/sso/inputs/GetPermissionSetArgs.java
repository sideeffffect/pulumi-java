// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPermissionSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPermissionSetArgs Empty = new GetPermissionSetArgs();

    /**
     * The sso instance arn that the permission set is owned.
     * 
     */
    @Import(name="instanceArn", required=true)
    private String instanceArn;

    public String instanceArn() {
        return this.instanceArn;
    }

    /**
     * The permission set that the policy will be attached to
     * 
     */
    @Import(name="permissionSetArn", required=true)
    private String permissionSetArn;

    public String permissionSetArn() {
        return this.permissionSetArn;
    }

    private GetPermissionSetArgs() {}

    private GetPermissionSetArgs(GetPermissionSetArgs $) {
        this.instanceArn = $.instanceArn;
        this.permissionSetArn = $.permissionSetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPermissionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPermissionSetArgs $;

        public Builder() {
            $ = new GetPermissionSetArgs();
        }

        public Builder(GetPermissionSetArgs defaults) {
            $ = new GetPermissionSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceArn(String instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        public Builder permissionSetArn(String permissionSetArn) {
            $.permissionSetArn = permissionSetArn;
            return this;
        }

        public GetPermissionSetArgs build() {
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            $.permissionSetArn = Objects.requireNonNull($.permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
            return $;
        }
    }

}
