// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResizeErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResizeErrorResponse Empty = new ResizeErrorResponse();

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    @Import(name="details")
    private @Nullable List<ResizeErrorResponse> details;

    public Optional<List<ResizeErrorResponse>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    private ResizeErrorResponse() {}

    private ResizeErrorResponse(ResizeErrorResponse $) {
        this.code = $.code;
        this.details = $.details;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResizeErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResizeErrorResponse $;

        public Builder() {
            $ = new ResizeErrorResponse();
        }

        public Builder(ResizeErrorResponse defaults) {
            $ = new ResizeErrorResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder details(@Nullable List<ResizeErrorResponse> details) {
            $.details = details;
            return this;
        }

        public Builder details(ResizeErrorResponse... details) {
            return details(List.of(details));
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public ResizeErrorResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
