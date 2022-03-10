// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The error message associated with the cluster creation.
 * 
 */
public final class ErrorsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ErrorsArgs Empty = new ErrorsArgs();

    /**
     * The error code.
     * 
     */
    @InputImport(name="code")
      private final @Nullable Input<String> code;

    public Input<String> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * The error message.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    public ErrorsArgs(
        @Nullable Input<String> code,
        @Nullable Input<String> message) {
        this.code = code;
        this.message = message;
    }

    private ErrorsArgs() {
        this.code = Input.empty();
        this.message = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> code;
        private @Nullable Input<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable Input<String> code) {
            this.code = code;
            return this;
        }

        public Builder code(@Nullable String code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder message(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }
        public ErrorsArgs build() {
            return new ErrorsArgs(code, message);
        }
    }
}
