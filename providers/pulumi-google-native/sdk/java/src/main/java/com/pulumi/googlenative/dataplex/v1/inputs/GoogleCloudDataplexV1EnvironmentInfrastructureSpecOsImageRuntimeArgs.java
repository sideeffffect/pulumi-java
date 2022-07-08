// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Software Runtime Configuration to run Analyze.
 * 
 */
public final class GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs Empty = new GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs();

    /**
     * Dataplex Image version.
     * 
     */
    @Import(name="imageVersion", required=true)
    private Output<String> imageVersion;

    /**
     * @return Dataplex Image version.
     * 
     */
    public Output<String> imageVersion() {
        return this.imageVersion;
    }

    /**
     * Optional. List of Java jars to be included in the runtime environment. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
     * 
     */
    @Import(name="javaLibraries")
    private @Nullable Output<List<String>> javaLibraries;

    /**
     * @return Optional. List of Java jars to be included in the runtime environment. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
     * 
     */
    public Optional<Output<List<String>>> javaLibraries() {
        return Optional.ofNullable(this.javaLibraries);
    }

    /**
     * Optional. Spark properties to provide configuration for use in sessions created for this environment. The properties to set on daemon config files. Property keys are specified in prefix:property format. The prefix must be &#34;spark&#34;.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Optional. Spark properties to provide configuration for use in sessions created for this environment. The properties to set on daemon config files. Property keys are specified in prefix:property format. The prefix must be &#34;spark&#34;.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
     * 
     */
    @Import(name="pythonPackages")
    private @Nullable Output<List<String>> pythonPackages;

    /**
     * @return Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
     * 
     */
    public Optional<Output<List<String>>> pythonPackages() {
        return Optional.ofNullable(this.pythonPackages);
    }

    private GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs() {}

    private GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs(GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs $) {
        this.imageVersion = $.imageVersion;
        this.javaLibraries = $.javaLibraries;
        this.properties = $.properties;
        this.pythonPackages = $.pythonPackages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs();
        }

        public Builder(GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs defaults) {
            $ = new GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageVersion Dataplex Image version.
         * 
         * @return builder
         * 
         */
        public Builder imageVersion(Output<String> imageVersion) {
            $.imageVersion = imageVersion;
            return this;
        }

        /**
         * @param imageVersion Dataplex Image version.
         * 
         * @return builder
         * 
         */
        public Builder imageVersion(String imageVersion) {
            return imageVersion(Output.of(imageVersion));
        }

        /**
         * @param javaLibraries Optional. List of Java jars to be included in the runtime environment. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
         * 
         * @return builder
         * 
         */
        public Builder javaLibraries(@Nullable Output<List<String>> javaLibraries) {
            $.javaLibraries = javaLibraries;
            return this;
        }

        /**
         * @param javaLibraries Optional. List of Java jars to be included in the runtime environment. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
         * 
         * @return builder
         * 
         */
        public Builder javaLibraries(List<String> javaLibraries) {
            return javaLibraries(Output.of(javaLibraries));
        }

        /**
         * @param javaLibraries Optional. List of Java jars to be included in the runtime environment. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
         * 
         * @return builder
         * 
         */
        public Builder javaLibraries(String... javaLibraries) {
            return javaLibraries(List.of(javaLibraries));
        }

        /**
         * @param properties Optional. Spark properties to provide configuration for use in sessions created for this environment. The properties to set on daemon config files. Property keys are specified in prefix:property format. The prefix must be &#34;spark&#34;.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Optional. Spark properties to provide configuration for use in sessions created for this environment. The properties to set on daemon config files. Property keys are specified in prefix:property format. The prefix must be &#34;spark&#34;.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param pythonPackages Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
         * 
         * @return builder
         * 
         */
        public Builder pythonPackages(@Nullable Output<List<String>> pythonPackages) {
            $.pythonPackages = pythonPackages;
            return this;
        }

        /**
         * @param pythonPackages Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
         * 
         * @return builder
         * 
         */
        public Builder pythonPackages(List<String> pythonPackages) {
            return pythonPackages(Output.of(pythonPackages));
        }

        /**
         * @param pythonPackages Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
         * 
         * @return builder
         * 
         */
        public Builder pythonPackages(String... pythonPackages) {
            return pythonPackages(List.of(pythonPackages));
        }

        public GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs build() {
            $.imageVersion = Objects.requireNonNull($.imageVersion, "expected parameter 'imageVersion' to be non-null");
            return $;
        }
    }

}
