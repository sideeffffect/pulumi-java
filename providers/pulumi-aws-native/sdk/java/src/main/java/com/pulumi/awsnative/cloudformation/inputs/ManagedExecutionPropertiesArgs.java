// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
 * 
 */
public final class ManagedExecutionPropertiesArgs extends ResourceArgs {

    public static final ManagedExecutionPropertiesArgs Empty = new ManagedExecutionPropertiesArgs();

    @Import(name="active")
    private @Nullable Output<Boolean> active;

    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    private ManagedExecutionPropertiesArgs() {}

    private ManagedExecutionPropertiesArgs(ManagedExecutionPropertiesArgs $) {
        this.active = $.active;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedExecutionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedExecutionPropertiesArgs $;

        public Builder() {
            $ = new ManagedExecutionPropertiesArgs();
        }

        public Builder(ManagedExecutionPropertiesArgs defaults) {
            $ = new ManagedExecutionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        public ManagedExecutionPropertiesArgs build() {
            return $;
        }
    }

}
