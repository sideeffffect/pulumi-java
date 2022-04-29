// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness;

import com.pulumi.awsnative.route53recoveryreadiness.inputs.ReadinessCheckTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReadinessCheckArgs extends ResourceArgs {

    public static final ReadinessCheckArgs Empty = new ReadinessCheckArgs();

    /**
     * Name of the ReadinessCheck to create.
     * 
     */
    @Import(name="readinessCheckName")
    private @Nullable Output<String> readinessCheckName;

    /**
     * @return Name of the ReadinessCheck to create.
     * 
     */
    public Optional<Output<String>> readinessCheckName() {
        return Optional.ofNullable(this.readinessCheckName);
    }

    /**
     * The name of the resource set to check.
     * 
     */
    @Import(name="resourceSetName")
    private @Nullable Output<String> resourceSetName;

    /**
     * @return The name of the resource set to check.
     * 
     */
    public Optional<Output<String>> resourceSetName() {
        return Optional.ofNullable(this.resourceSetName);
    }

    /**
     * A collection of tags associated with a resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ReadinessCheckTagArgs>> tags;

    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    public Optional<Output<List<ReadinessCheckTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ReadinessCheckArgs() {}

    private ReadinessCheckArgs(ReadinessCheckArgs $) {
        this.readinessCheckName = $.readinessCheckName;
        this.resourceSetName = $.resourceSetName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReadinessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReadinessCheckArgs $;

        public Builder() {
            $ = new ReadinessCheckArgs();
        }

        public Builder(ReadinessCheckArgs defaults) {
            $ = new ReadinessCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param readinessCheckName Name of the ReadinessCheck to create.
         * 
         * @return builder
         * 
         */
        public Builder readinessCheckName(@Nullable Output<String> readinessCheckName) {
            $.readinessCheckName = readinessCheckName;
            return this;
        }

        /**
         * @param readinessCheckName Name of the ReadinessCheck to create.
         * 
         * @return builder
         * 
         */
        public Builder readinessCheckName(String readinessCheckName) {
            return readinessCheckName(Output.of(readinessCheckName));
        }

        /**
         * @param resourceSetName The name of the resource set to check.
         * 
         * @return builder
         * 
         */
        public Builder resourceSetName(@Nullable Output<String> resourceSetName) {
            $.resourceSetName = resourceSetName;
            return this;
        }

        /**
         * @param resourceSetName The name of the resource set to check.
         * 
         * @return builder
         * 
         */
        public Builder resourceSetName(String resourceSetName) {
            return resourceSetName(Output.of(resourceSetName));
        }

        /**
         * @param tags A collection of tags associated with a resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ReadinessCheckTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A collection of tags associated with a resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ReadinessCheckTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A collection of tags associated with a resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(ReadinessCheckTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ReadinessCheckArgs build() {
            return $;
        }
    }

}
