// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsSchemaRecordColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsSchemaRecordColumnArgs Empty = new AnalyticsApplicationInputsSchemaRecordColumnArgs();

    /**
     * The Mapping reference to the data element.
     * 
     */
    @Import(name="mapping")
      private final @Nullable Output<String> mapping;

    public Output<String> mapping() {
        return this.mapping == null ? Codegen.empty() : this.mapping;
    }

    /**
     * Name of the column.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The SQL Type of the column.
     * 
     */
    @Import(name="sqlType", required=true)
      private final Output<String> sqlType;

    public Output<String> sqlType() {
        return this.sqlType;
    }

    public AnalyticsApplicationInputsSchemaRecordColumnArgs(
        @Nullable Output<String> mapping,
        Output<String> name,
        Output<String> sqlType) {
        this.mapping = mapping;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sqlType = Objects.requireNonNull(sqlType, "expected parameter 'sqlType' to be non-null");
    }

    private AnalyticsApplicationInputsSchemaRecordColumnArgs() {
        this.mapping = Codegen.empty();
        this.name = Codegen.empty();
        this.sqlType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaRecordColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mapping;
        private Output<String> name;
        private Output<String> sqlType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsSchemaRecordColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapping = defaults.mapping;
    	      this.name = defaults.name;
    	      this.sqlType = defaults.sqlType;
        }

        public Builder mapping(@Nullable Output<String> mapping) {
            this.mapping = mapping;
            return this;
        }
        public Builder mapping(@Nullable String mapping) {
            this.mapping = Codegen.ofNullable(mapping);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder sqlType(Output<String> sqlType) {
            this.sqlType = Objects.requireNonNull(sqlType);
            return this;
        }
        public Builder sqlType(String sqlType) {
            this.sqlType = Output.of(Objects.requireNonNull(sqlType));
            return this;
        }        public AnalyticsApplicationInputsSchemaRecordColumnArgs build() {
            return new AnalyticsApplicationInputsSchemaRecordColumnArgs(mapping, name, sqlType);
        }
    }
}
