// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.RecoveryPlanGroupType;
import com.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanActionArgs;
import com.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanProtectedItemArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Recovery plan group details.
 * 
 */
public final class RecoveryPlanGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecoveryPlanGroupArgs Empty = new RecoveryPlanGroupArgs();

    /**
     * The end group actions.
     * 
     */
    @Import(name="endGroupActions")
    private @Nullable Output<List<RecoveryPlanActionArgs>> endGroupActions;

    public Optional<Output<List<RecoveryPlanActionArgs>>> endGroupActions() {
        return Optional.ofNullable(this.endGroupActions);
    }

    /**
     * The group type.
     * 
     */
    @Import(name="groupType", required=true)
    private Output<Either<String,RecoveryPlanGroupType>> groupType;

    public Output<Either<String,RecoveryPlanGroupType>> groupType() {
        return this.groupType;
    }

    /**
     * The list of protected items.
     * 
     */
    @Import(name="replicationProtectedItems")
    private @Nullable Output<List<RecoveryPlanProtectedItemArgs>> replicationProtectedItems;

    public Optional<Output<List<RecoveryPlanProtectedItemArgs>>> replicationProtectedItems() {
        return Optional.ofNullable(this.replicationProtectedItems);
    }

    /**
     * The start group actions.
     * 
     */
    @Import(name="startGroupActions")
    private @Nullable Output<List<RecoveryPlanActionArgs>> startGroupActions;

    public Optional<Output<List<RecoveryPlanActionArgs>>> startGroupActions() {
        return Optional.ofNullable(this.startGroupActions);
    }

    private RecoveryPlanGroupArgs() {}

    private RecoveryPlanGroupArgs(RecoveryPlanGroupArgs $) {
        this.endGroupActions = $.endGroupActions;
        this.groupType = $.groupType;
        this.replicationProtectedItems = $.replicationProtectedItems;
        this.startGroupActions = $.startGroupActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecoveryPlanGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecoveryPlanGroupArgs $;

        public Builder() {
            $ = new RecoveryPlanGroupArgs();
        }

        public Builder(RecoveryPlanGroupArgs defaults) {
            $ = new RecoveryPlanGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder endGroupActions(@Nullable Output<List<RecoveryPlanActionArgs>> endGroupActions) {
            $.endGroupActions = endGroupActions;
            return this;
        }

        public Builder endGroupActions(List<RecoveryPlanActionArgs> endGroupActions) {
            return endGroupActions(Output.of(endGroupActions));
        }

        public Builder endGroupActions(RecoveryPlanActionArgs... endGroupActions) {
            return endGroupActions(List.of(endGroupActions));
        }

        public Builder groupType(Output<Either<String,RecoveryPlanGroupType>> groupType) {
            $.groupType = groupType;
            return this;
        }

        public Builder groupType(Either<String,RecoveryPlanGroupType> groupType) {
            return groupType(Output.of(groupType));
        }

        public Builder replicationProtectedItems(@Nullable Output<List<RecoveryPlanProtectedItemArgs>> replicationProtectedItems) {
            $.replicationProtectedItems = replicationProtectedItems;
            return this;
        }

        public Builder replicationProtectedItems(List<RecoveryPlanProtectedItemArgs> replicationProtectedItems) {
            return replicationProtectedItems(Output.of(replicationProtectedItems));
        }

        public Builder replicationProtectedItems(RecoveryPlanProtectedItemArgs... replicationProtectedItems) {
            return replicationProtectedItems(List.of(replicationProtectedItems));
        }

        public Builder startGroupActions(@Nullable Output<List<RecoveryPlanActionArgs>> startGroupActions) {
            $.startGroupActions = startGroupActions;
            return this;
        }

        public Builder startGroupActions(List<RecoveryPlanActionArgs> startGroupActions) {
            return startGroupActions(Output.of(startGroupActions));
        }

        public Builder startGroupActions(RecoveryPlanActionArgs... startGroupActions) {
            return startGroupActions(List.of(startGroupActions));
        }

        public RecoveryPlanGroupArgs build() {
            $.groupType = Objects.requireNonNull($.groupType, "expected parameter 'groupType' to be non-null");
            return $;
        }
    }

}
