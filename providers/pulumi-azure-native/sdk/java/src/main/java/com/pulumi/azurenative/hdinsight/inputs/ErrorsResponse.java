// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The error message associated with the cluster creation.
 * 
 */
public final class ErrorsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ErrorsResponse Empty = new ErrorsResponse();

    /**
     * The error code.
     * 
     */
    @Import(name="code")
    private @Nullable String code;

    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * The error message.
     * 
     */
    @Import(name="message")
    private @Nullable String message;

    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    private ErrorsResponse() {}

    private ErrorsResponse(ErrorsResponse $) {
        this.code = $.code;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ErrorsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorsResponse $;

        public Builder() {
            $ = new ErrorsResponse();
        }

        public Builder(ErrorsResponse defaults) {
            $ = new ErrorsResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(@Nullable String code) {
            $.code = code;
            return this;
        }

        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        public ErrorsResponse build() {
            return $;
        }
    }

}
