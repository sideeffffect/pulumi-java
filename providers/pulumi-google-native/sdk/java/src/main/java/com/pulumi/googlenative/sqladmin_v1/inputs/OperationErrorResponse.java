// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Database instance operation error.
 * 
 */
public final class OperationErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final OperationErrorResponse Empty = new OperationErrorResponse();

    /**
     * Identifies the specific error that occurred.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    /**
     * This is always `sql#operationError`.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Additional information about the error encountered.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    private OperationErrorResponse() {}

    private OperationErrorResponse(OperationErrorResponse $) {
        this.code = $.code;
        this.kind = $.kind;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationErrorResponse $;

        public Builder() {
            $ = new OperationErrorResponse();
        }

        public Builder(OperationErrorResponse defaults) {
            $ = new OperationErrorResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public OperationErrorResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
