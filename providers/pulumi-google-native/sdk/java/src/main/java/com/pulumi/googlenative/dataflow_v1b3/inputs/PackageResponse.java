// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The packages that must be installed in order for a worker to run the steps of the Cloud Dataflow job that will be assigned to its worker pool. This is the mechanism by which the Cloud Dataflow SDK causes code to be loaded onto the workers. For example, the Cloud Dataflow Java SDK might use this to install jars containing the user&#39;s code and all of the various dependencies (libraries, data files, etc.) required in order for that code to run.
 * 
 */
public final class PackageResponse extends com.pulumi.resources.InvokeArgs {

    public static final PackageResponse Empty = new PackageResponse();

    /**
     * The resource to read the package from. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket} bucket.storage.googleapis.com/
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    /**
     * The name of the package.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private PackageResponse() {}

    private PackageResponse(PackageResponse $) {
        this.location = $.location;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackageResponse $;

        public Builder() {
            $ = new PackageResponse();
        }

        public Builder(PackageResponse defaults) {
            $ = new PackageResponse(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public PackageResponse build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
