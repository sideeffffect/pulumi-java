// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Log location settings.
 * 
 */
public final class LogLocationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogLocationSettingsArgs Empty = new LogLocationSettingsArgs();

    /**
     * Log storage linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Log storage linked service reference.
     * 
     */
    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="path")
    private @Nullable Output<Object> path;

    /**
     * @return The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> path() {
        return Optional.ofNullable(this.path);
    }

    private LogLocationSettingsArgs() {}

    private LogLocationSettingsArgs(LogLocationSettingsArgs $) {
        this.linkedServiceName = $.linkedServiceName;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogLocationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogLocationSettingsArgs $;

        public Builder() {
            $ = new LogLocationSettingsArgs();
        }

        public Builder(LogLocationSettingsArgs defaults) {
            $ = new LogLocationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkedServiceName Log storage linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Log storage linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param path The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<Object> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder path(Object path) {
            return path(Output.of(path));
        }

        public LogLocationSettingsArgs build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            return $;
        }
    }

}
