// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LinkedWorkspace specific properties.
 * 
 */
public final class LinkedWorkspacePropsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedWorkspacePropsArgs Empty = new LinkedWorkspacePropsArgs();

    /**
     * ResourceId of the link target of the linked workspace.
     * 
     */
    @Import(name="linkedWorkspaceResourceId")
    private @Nullable Output<String> linkedWorkspaceResourceId;

    public Optional<Output<String>> linkedWorkspaceResourceId() {
        return Optional.ofNullable(this.linkedWorkspaceResourceId);
    }

    /**
     * ResourceId of the user assigned identity for the linked workspace.
     * 
     */
    @Import(name="userAssignedIdentityResourceId")
    private @Nullable Output<String> userAssignedIdentityResourceId;

    public Optional<Output<String>> userAssignedIdentityResourceId() {
        return Optional.ofNullable(this.userAssignedIdentityResourceId);
    }

    private LinkedWorkspacePropsArgs() {}

    private LinkedWorkspacePropsArgs(LinkedWorkspacePropsArgs $) {
        this.linkedWorkspaceResourceId = $.linkedWorkspaceResourceId;
        this.userAssignedIdentityResourceId = $.userAssignedIdentityResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedWorkspacePropsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedWorkspacePropsArgs $;

        public Builder() {
            $ = new LinkedWorkspacePropsArgs();
        }

        public Builder(LinkedWorkspacePropsArgs defaults) {
            $ = new LinkedWorkspacePropsArgs(Objects.requireNonNull(defaults));
        }

        public Builder linkedWorkspaceResourceId(@Nullable Output<String> linkedWorkspaceResourceId) {
            $.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
            return this;
        }

        public Builder linkedWorkspaceResourceId(String linkedWorkspaceResourceId) {
            return linkedWorkspaceResourceId(Output.of(linkedWorkspaceResourceId));
        }

        public Builder userAssignedIdentityResourceId(@Nullable Output<String> userAssignedIdentityResourceId) {
            $.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
            return this;
        }

        public Builder userAssignedIdentityResourceId(String userAssignedIdentityResourceId) {
            return userAssignedIdentityResourceId(Output.of(userAssignedIdentityResourceId));
        }

        public LinkedWorkspacePropsArgs build() {
            return $;
        }
    }

}
