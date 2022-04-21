// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflowexecutions_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Position contains source position information about the stack trace element such as line number, column number and length of the code block in bytes.
 * 
 */
public final class PositionResponse extends com.pulumi.resources.InvokeArgs {

    public static final PositionResponse Empty = new PositionResponse();

    /**
     * The source code column position (of the line) the current instruction was generated from.
     * 
     */
    @Import(name="column", required=true)
    private String column;

    public String column() {
        return this.column;
    }

    /**
     * The number of bytes of source code making up this stack trace element.
     * 
     */
    @Import(name="length", required=true)
    private String length;

    public String length() {
        return this.length;
    }

    /**
     * The source code line number the current instruction was generated from.
     * 
     */
    @Import(name="line", required=true)
    private String line;

    public String line() {
        return this.line;
    }

    private PositionResponse() {}

    private PositionResponse(PositionResponse $) {
        this.column = $.column;
        this.length = $.length;
        this.line = $.line;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PositionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PositionResponse $;

        public Builder() {
            $ = new PositionResponse();
        }

        public Builder(PositionResponse defaults) {
            $ = new PositionResponse(Objects.requireNonNull(defaults));
        }

        public Builder column(String column) {
            $.column = column;
            return this;
        }

        public Builder length(String length) {
            $.length = length;
            return this;
        }

        public Builder line(String line) {
            $.line = line;
            return this;
        }

        public PositionResponse build() {
            $.column = Objects.requireNonNull($.column, "expected parameter 'column' to be non-null");
            $.length = Objects.requireNonNull($.length, "expected parameter 'length' to be non-null");
            $.line = Objects.requireNonNull($.line, "expected parameter 'line' to be non-null");
            return $;
        }
    }

}
