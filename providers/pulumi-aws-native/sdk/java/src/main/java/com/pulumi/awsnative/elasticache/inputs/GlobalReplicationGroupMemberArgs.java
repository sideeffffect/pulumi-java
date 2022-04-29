// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache.inputs;

import com.pulumi.awsnative.elasticache.enums.GlobalReplicationGroupMemberRole;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupMemberArgs extends ResourceArgs {

    public static final GlobalReplicationGroupMemberArgs Empty = new GlobalReplicationGroupMemberArgs();

    /**
     * Regionally unique identifier for the member i.e. ReplicationGroupId.
     * 
     */
    @Import(name="replicationGroupId")
    private @Nullable Output<String> replicationGroupId;

    /**
     * @return Regionally unique identifier for the member i.e. ReplicationGroupId.
     * 
     */
    public Optional<Output<String>> replicationGroupId() {
        return Optional.ofNullable(this.replicationGroupId);
    }

    /**
     * The AWS region of the Global Datastore member.
     * 
     */
    @Import(name="replicationGroupRegion")
    private @Nullable Output<String> replicationGroupRegion;

    /**
     * @return The AWS region of the Global Datastore member.
     * 
     */
    public Optional<Output<String>> replicationGroupRegion() {
        return Optional.ofNullable(this.replicationGroupRegion);
    }

    /**
     * Indicates the role of the member, primary or secondary.
     * 
     */
    @Import(name="role")
    private @Nullable Output<GlobalReplicationGroupMemberRole> role;

    /**
     * @return Indicates the role of the member, primary or secondary.
     * 
     */
    public Optional<Output<GlobalReplicationGroupMemberRole>> role() {
        return Optional.ofNullable(this.role);
    }

    private GlobalReplicationGroupMemberArgs() {}

    private GlobalReplicationGroupMemberArgs(GlobalReplicationGroupMemberArgs $) {
        this.replicationGroupId = $.replicationGroupId;
        this.replicationGroupRegion = $.replicationGroupRegion;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalReplicationGroupMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalReplicationGroupMemberArgs $;

        public Builder() {
            $ = new GlobalReplicationGroupMemberArgs();
        }

        public Builder(GlobalReplicationGroupMemberArgs defaults) {
            $ = new GlobalReplicationGroupMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param replicationGroupId Regionally unique identifier for the member i.e. ReplicationGroupId.
         * 
         * @return builder
         * 
         */
        public Builder replicationGroupId(@Nullable Output<String> replicationGroupId) {
            $.replicationGroupId = replicationGroupId;
            return this;
        }

        /**
         * @param replicationGroupId Regionally unique identifier for the member i.e. ReplicationGroupId.
         * 
         * @return builder
         * 
         */
        public Builder replicationGroupId(String replicationGroupId) {
            return replicationGroupId(Output.of(replicationGroupId));
        }

        /**
         * @param replicationGroupRegion The AWS region of the Global Datastore member.
         * 
         * @return builder
         * 
         */
        public Builder replicationGroupRegion(@Nullable Output<String> replicationGroupRegion) {
            $.replicationGroupRegion = replicationGroupRegion;
            return this;
        }

        /**
         * @param replicationGroupRegion The AWS region of the Global Datastore member.
         * 
         * @return builder
         * 
         */
        public Builder replicationGroupRegion(String replicationGroupRegion) {
            return replicationGroupRegion(Output.of(replicationGroupRegion));
        }

        /**
         * @param role Indicates the role of the member, primary or secondary.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<GlobalReplicationGroupMemberRole> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Indicates the role of the member, primary or secondary.
         * 
         * @return builder
         * 
         */
        public Builder role(GlobalReplicationGroupMemberRole role) {
            return role(Output.of(role));
        }

        public GlobalReplicationGroupMemberArgs build() {
            return $;
        }
    }

}
