// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness;

import com.pulumi.awsnative.route53recoveryreadiness.inputs.RecoveryGroupTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecoveryGroupArgs extends ResourceArgs {

    public static final RecoveryGroupArgs Empty = new RecoveryGroupArgs();

    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     * 
     */
    @Import(name="cells")
    private @Nullable Output<List<String>> cells;

    /**
     * @return A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     * 
     */
    public Optional<Output<List<String>>> cells() {
        return Optional.ofNullable(this.cells);
    }

    /**
     * The name of the recovery group to create.
     * 
     */
    @Import(name="recoveryGroupName")
    private @Nullable Output<String> recoveryGroupName;

    /**
     * @return The name of the recovery group to create.
     * 
     */
    public Optional<Output<String>> recoveryGroupName() {
        return Optional.ofNullable(this.recoveryGroupName);
    }

    /**
     * A collection of tags associated with a resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<RecoveryGroupTagArgs>> tags;

    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    public Optional<Output<List<RecoveryGroupTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RecoveryGroupArgs() {}

    private RecoveryGroupArgs(RecoveryGroupArgs $) {
        this.cells = $.cells;
        this.recoveryGroupName = $.recoveryGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecoveryGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecoveryGroupArgs $;

        public Builder() {
            $ = new RecoveryGroupArgs();
        }

        public Builder(RecoveryGroupArgs defaults) {
            $ = new RecoveryGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group.
         * 
         * @return builder
         * 
         */
        public Builder cells(@Nullable Output<List<String>> cells) {
            $.cells = cells;
            return this;
        }

        /**
         * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group.
         * 
         * @return builder
         * 
         */
        public Builder cells(List<String> cells) {
            return cells(Output.of(cells));
        }

        /**
         * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group.
         * 
         * @return builder
         * 
         */
        public Builder cells(String... cells) {
            return cells(List.of(cells));
        }

        /**
         * @param recoveryGroupName The name of the recovery group to create.
         * 
         * @return builder
         * 
         */
        public Builder recoveryGroupName(@Nullable Output<String> recoveryGroupName) {
            $.recoveryGroupName = recoveryGroupName;
            return this;
        }

        /**
         * @param recoveryGroupName The name of the recovery group to create.
         * 
         * @return builder
         * 
         */
        public Builder recoveryGroupName(String recoveryGroupName) {
            return recoveryGroupName(Output.of(recoveryGroupName));
        }

        /**
         * @param tags A collection of tags associated with a resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<RecoveryGroupTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A collection of tags associated with a resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<RecoveryGroupTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A collection of tags associated with a resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(RecoveryGroupTagArgs... tags) {
            return tags(List.of(tags));
        }

        public RecoveryGroupArgs build() {
            return $;
        }
    }

}
