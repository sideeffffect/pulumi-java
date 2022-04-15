// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs();

    /**
     * Describes the data format when records are written to the destination.
     * 
     */
    @Import(name="destinationSchema", required=true)
      private final Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema() {
        return this.destinationSchema;
    }

    /**
     * Identifies a Kinesis Data Firehose delivery stream as the destination.
     * 
     */
    @Import(name="kinesisFirehoseOutput")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput() {
        return this.kinesisFirehoseOutput == null ? Codegen.empty() : this.kinesisFirehoseOutput;
    }

    /**
     * Identifies a Kinesis data stream as the destination.
     * 
     */
    @Import(name="kinesisStreamsOutput")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput() {
        return this.kinesisStreamsOutput == null ? Codegen.empty() : this.kinesisStreamsOutput;
    }

    /**
     * Identifies a Lambda function as the destination.
     * 
     */
    @Import(name="lambdaOutput")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput() {
        return this.lambdaOutput == null ? Codegen.empty() : this.lambdaOutput;
    }

    /**
     * The name of the in-application stream.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="outputId")
      private final @Nullable Output<String> outputId;

    public Output<String> outputId() {
        return this.outputId == null ? Codegen.empty() : this.outputId;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs(
        Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput,
        Output<String> name,
        @Nullable Output<String> outputId) {
        this.destinationSchema = Objects.requireNonNull(destinationSchema, "expected parameter 'destinationSchema' to be non-null");
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
        this.kinesisStreamsOutput = kinesisStreamsOutput;
        this.lambdaOutput = lambdaOutput;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputId = outputId;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs() {
        this.destinationSchema = Codegen.empty();
        this.kinesisFirehoseOutput = Codegen.empty();
        this.kinesisStreamsOutput = Codegen.empty();
        this.lambdaOutput = Codegen.empty();
        this.name = Codegen.empty();
        this.outputId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput;
        private Output<String> name;
        private @Nullable Output<String> outputId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationSchema = defaults.destinationSchema;
    	      this.kinesisFirehoseOutput = defaults.kinesisFirehoseOutput;
    	      this.kinesisStreamsOutput = defaults.kinesisStreamsOutput;
    	      this.lambdaOutput = defaults.lambdaOutput;
    	      this.name = defaults.name;
    	      this.outputId = defaults.outputId;
        }

        public Builder destinationSchema(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema) {
            this.destinationSchema = Objects.requireNonNull(destinationSchema);
            return this;
        }
        public Builder destinationSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs destinationSchema) {
            this.destinationSchema = Output.of(Objects.requireNonNull(destinationSchema));
            return this;
        }
        public Builder kinesisFirehoseOutput(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput) {
            this.kinesisFirehoseOutput = kinesisFirehoseOutput;
            return this;
        }
        public Builder kinesisFirehoseOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs kinesisFirehoseOutput) {
            this.kinesisFirehoseOutput = Codegen.ofNullable(kinesisFirehoseOutput);
            return this;
        }
        public Builder kinesisStreamsOutput(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput) {
            this.kinesisStreamsOutput = kinesisStreamsOutput;
            return this;
        }
        public Builder kinesisStreamsOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs kinesisStreamsOutput) {
            this.kinesisStreamsOutput = Codegen.ofNullable(kinesisStreamsOutput);
            return this;
        }
        public Builder lambdaOutput(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput) {
            this.lambdaOutput = lambdaOutput;
            return this;
        }
        public Builder lambdaOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs lambdaOutput) {
            this.lambdaOutput = Codegen.ofNullable(lambdaOutput);
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
        public Builder outputId(@Nullable Output<String> outputId) {
            this.outputId = outputId;
            return this;
        }
        public Builder outputId(@Nullable String outputId) {
            this.outputId = Codegen.ofNullable(outputId);
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs(destinationSchema, kinesisFirehoseOutput, kinesisStreamsOutput, lambdaOutput, name, outputId);
        }
    }
}
