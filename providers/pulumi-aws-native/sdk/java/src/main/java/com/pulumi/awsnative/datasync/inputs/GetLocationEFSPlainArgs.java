// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocationEFSPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationEFSPlainArgs Empty = new GetLocationEFSPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
     * 
     */
    @Import(name="locationArn", required=true)
    private String locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
     * 
     */
    public String locationArn() {
        return this.locationArn;
    }

    private GetLocationEFSPlainArgs() {}

    private GetLocationEFSPlainArgs(GetLocationEFSPlainArgs $) {
        this.locationArn = $.locationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationEFSPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationEFSPlainArgs $;

        public Builder() {
            $ = new GetLocationEFSPlainArgs();
        }

        public Builder(GetLocationEFSPlainArgs defaults) {
            $ = new GetLocationEFSPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        public GetLocationEFSPlainArgs build() {
            $.locationArn = Objects.requireNonNull($.locationArn, "expected parameter 'locationArn' to be non-null");
            return $;
        }
    }

}
