// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iottwinmaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetComponentTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComponentTypePlainArgs Empty = new GetComponentTypePlainArgs();

    /**
     * The ID of the component type.
     * 
     */
    @Import(name="componentTypeId", required=true)
    private String componentTypeId;

    /**
     * @return The ID of the component type.
     * 
     */
    public String componentTypeId() {
        return this.componentTypeId;
    }

    /**
     * The ID of the workspace that contains the component type.
     * 
     */
    @Import(name="workspaceId", required=true)
    private String workspaceId;

    /**
     * @return The ID of the workspace that contains the component type.
     * 
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    private GetComponentTypePlainArgs() {}

    private GetComponentTypePlainArgs(GetComponentTypePlainArgs $) {
        this.componentTypeId = $.componentTypeId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComponentTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComponentTypePlainArgs $;

        public Builder() {
            $ = new GetComponentTypePlainArgs();
        }

        public Builder(GetComponentTypePlainArgs defaults) {
            $ = new GetComponentTypePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentTypeId The ID of the component type.
         * 
         * @return builder
         * 
         */
        public Builder componentTypeId(String componentTypeId) {
            $.componentTypeId = componentTypeId;
            return this;
        }

        /**
         * @param workspaceId The ID of the workspace that contains the component type.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        public GetComponentTypePlainArgs build() {
            $.componentTypeId = Objects.requireNonNull($.componentTypeId, "expected parameter 'componentTypeId' to be non-null");
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            return $;
        }
    }

}
