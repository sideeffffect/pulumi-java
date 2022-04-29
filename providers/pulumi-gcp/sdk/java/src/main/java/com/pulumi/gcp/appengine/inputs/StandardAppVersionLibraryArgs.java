// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardAppVersionLibraryArgs extends ResourceArgs {

    public static final StandardAppVersionLibraryArgs Empty = new StandardAppVersionLibraryArgs();

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Version of the library to select, or &#34;latest&#34;.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of the library to select, or &#34;latest&#34;.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private StandardAppVersionLibraryArgs() {}

    private StandardAppVersionLibraryArgs(StandardAppVersionLibraryArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardAppVersionLibraryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardAppVersionLibraryArgs $;

        public Builder() {
            $ = new StandardAppVersionLibraryArgs();
        }

        public Builder(StandardAppVersionLibraryArgs defaults) {
            $ = new StandardAppVersionLibraryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version Version of the library to select, or &#34;latest&#34;.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the library to select, or &#34;latest&#34;.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public StandardAppVersionLibraryArgs build() {
            return $;
        }
    }

}
