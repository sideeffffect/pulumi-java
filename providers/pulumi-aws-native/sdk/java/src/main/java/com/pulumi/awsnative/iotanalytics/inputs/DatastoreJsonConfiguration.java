// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import java.util.Objects;


public final class DatastoreJsonConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DatastoreJsonConfiguration Empty = new DatastoreJsonConfiguration();

    public DatastoreJsonConfiguration() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreJsonConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreJsonConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public DatastoreJsonConfiguration build() {
            return new DatastoreJsonConfiguration();
        }
    }
}
