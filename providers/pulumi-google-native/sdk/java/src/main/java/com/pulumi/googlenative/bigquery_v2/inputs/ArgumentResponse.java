// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.StandardSqlDataTypeResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Input/output argument of a function or a stored procedure.
 * 
 */
public final class ArgumentResponse extends com.pulumi.resources.InvokeArgs {

    public static final ArgumentResponse Empty = new ArgumentResponse();

    /**
     * Optional. Defaults to FIXED_TYPE.
     * 
     */
    @Import(name="argumentKind", required=true)
    private String argumentKind;

    public String argumentKind() {
        return this.argumentKind;
    }

    /**
     * Required unless argument_kind = ANY_TYPE.
     * 
     */
    @Import(name="dataType", required=true)
    private StandardSqlDataTypeResponse dataType;

    public StandardSqlDataTypeResponse dataType() {
        return this.dataType;
    }

    /**
     * Optional. Specifies whether the argument is input or output. Can be set for procedures only.
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    public String mode() {
        return this.mode;
    }

    /**
     * Optional. The name of this argument. Can be absent for function return argument.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private ArgumentResponse() {}

    private ArgumentResponse(ArgumentResponse $) {
        this.argumentKind = $.argumentKind;
        this.dataType = $.dataType;
        this.mode = $.mode;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArgumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArgumentResponse $;

        public Builder() {
            $ = new ArgumentResponse();
        }

        public Builder(ArgumentResponse defaults) {
            $ = new ArgumentResponse(Objects.requireNonNull(defaults));
        }

        public Builder argumentKind(String argumentKind) {
            $.argumentKind = argumentKind;
            return this;
        }

        public Builder dataType(StandardSqlDataTypeResponse dataType) {
            $.dataType = dataType;
            return this;
        }

        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public ArgumentResponse build() {
            $.argumentKind = Objects.requireNonNull($.argumentKind, "expected parameter 'argumentKind' to be non-null");
            $.dataType = Objects.requireNonNull($.dataType, "expected parameter 'dataType' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
