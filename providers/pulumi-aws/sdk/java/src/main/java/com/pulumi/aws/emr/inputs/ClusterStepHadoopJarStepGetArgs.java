// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterStepHadoopJarStepGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterStepHadoopJarStepGetArgs Empty = new ClusterStepHadoopJarStepGetArgs();

    /**
     * List of command line arguments passed to the JAR file&#39;s main function when executed.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Path to a JAR file run during the step.
     * 
     */
    @Import(name="jar", required=true)
    private Output<String> jar;

    public Output<String> jar() {
        return this.jar;
    }

    /**
     * Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
     * 
     */
    @Import(name="mainClass")
    private @Nullable Output<String> mainClass;

    public Optional<Output<String>> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }

    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private ClusterStepHadoopJarStepGetArgs() {}

    private ClusterStepHadoopJarStepGetArgs(ClusterStepHadoopJarStepGetArgs $) {
        this.args = $.args;
        this.jar = $.jar;
        this.mainClass = $.mainClass;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterStepHadoopJarStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterStepHadoopJarStepGetArgs $;

        public Builder() {
            $ = new ClusterStepHadoopJarStepGetArgs();
        }

        public Builder(ClusterStepHadoopJarStepGetArgs defaults) {
            $ = new ClusterStepHadoopJarStepGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        public Builder args(String... args) {
            return args(List.of(args));
        }

        public Builder jar(Output<String> jar) {
            $.jar = jar;
            return this;
        }

        public Builder jar(String jar) {
            return jar(Output.of(jar));
        }

        public Builder mainClass(@Nullable Output<String> mainClass) {
            $.mainClass = mainClass;
            return this;
        }

        public Builder mainClass(String mainClass) {
            return mainClass(Output.of(mainClass));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public ClusterStepHadoopJarStepGetArgs build() {
            $.jar = Objects.requireNonNull($.jar, "expected parameter 'jar' to be non-null");
            return $;
        }
    }

}
