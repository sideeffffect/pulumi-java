// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database instance operation error.
 * 
 */
public final class OperationErrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final OperationErrorArgs Empty = new OperationErrorArgs();

    /**
     * Identifies the specific error that occurred.
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * This is always `sql#operationError`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Additional information about the error encountered.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    private OperationErrorArgs() {}

    private OperationErrorArgs(OperationErrorArgs $) {
        this.code = $.code;
        this.kind = $.kind;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationErrorArgs $;

        public Builder() {
            $ = new OperationErrorArgs();
        }

        public Builder(OperationErrorArgs defaults) {
            $ = new OperationErrorArgs(Objects.requireNonNull(defaults));
        }

        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        public Builder code(String code) {
            return code(Output.of(code));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public OperationErrorArgs build() {
            return $;
        }
    }

}
