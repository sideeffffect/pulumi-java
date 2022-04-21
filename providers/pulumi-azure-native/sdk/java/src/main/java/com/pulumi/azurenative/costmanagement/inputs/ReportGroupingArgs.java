// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.ReportColumnType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The group by expression to be used in the report.
 * 
 */
public final class ReportGroupingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportGroupingArgs Empty = new ReportGroupingArgs();

    /**
     * The name of the column to group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Has type of the column to group.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ReportColumnType>> type;

    public Output<Either<String,ReportColumnType>> type() {
        return this.type;
    }

    private ReportGroupingArgs() {}

    private ReportGroupingArgs(ReportGroupingArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportGroupingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportGroupingArgs $;

        public Builder() {
            $ = new ReportGroupingArgs();
        }

        public Builder(ReportGroupingArgs defaults) {
            $ = new ReportGroupingArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(Output<Either<String,ReportColumnType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,ReportColumnType> type) {
            return type(Output.of(type));
        }

        public ReportGroupingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
