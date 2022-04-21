// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.azurenative.kubernetesconfiguration.enums.LevelType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Status from this instance of the extension.
 * 
 */
public final class ExtensionStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionStatusArgs Empty = new ExtensionStatusArgs();

    /**
     * Status code provided by the Extension
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Short description of status of this instance of the extension.
     * 
     */
    @Import(name="displayStatus")
    private @Nullable Output<String> displayStatus;

    public Optional<Output<String>> displayStatus() {
        return Optional.ofNullable(this.displayStatus);
    }

    /**
     * Level of the status.
     * 
     */
    @Import(name="level")
    private @Nullable Output<Either<String,LevelType>> level;

    public Optional<Output<Either<String,LevelType>>> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * Detailed message of the status from the Extension instance.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * DateLiteral (per ISO8601) noting the time of installation status.
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    private ExtensionStatusArgs() {}

    private ExtensionStatusArgs(ExtensionStatusArgs $) {
        this.code = $.code;
        this.displayStatus = $.displayStatus;
        this.level = $.level;
        this.message = $.message;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionStatusArgs $;

        public Builder() {
            $ = new ExtensionStatusArgs();
        }

        public Builder(ExtensionStatusArgs defaults) {
            $ = new ExtensionStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        public Builder code(String code) {
            return code(Output.of(code));
        }

        public Builder displayStatus(@Nullable Output<String> displayStatus) {
            $.displayStatus = displayStatus;
            return this;
        }

        public Builder displayStatus(String displayStatus) {
            return displayStatus(Output.of(displayStatus));
        }

        public Builder level(@Nullable Output<Either<String,LevelType>> level) {
            $.level = level;
            return this;
        }

        public Builder level(Either<String,LevelType> level) {
            return level(Output.of(level));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        public Builder time(String time) {
            return time(Output.of(time));
        }

        public ExtensionStatusArgs build() {
            $.level = Codegen.stringProp("level").left(LevelType.class).output().arg($.level).def("Information").getNullable();
            return $;
        }
    }

}
