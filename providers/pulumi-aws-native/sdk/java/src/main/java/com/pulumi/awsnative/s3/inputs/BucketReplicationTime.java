// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketReplicationTimeStatus;
import com.pulumi.awsnative.s3.inputs.BucketReplicationTimeValue;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class BucketReplicationTime extends com.pulumi.resources.InvokeArgs {

    public static final BucketReplicationTime Empty = new BucketReplicationTime();

    @Import(name="status", required=true)
    private BucketReplicationTimeStatus status;

    public BucketReplicationTimeStatus status() {
        return this.status;
    }

    @Import(name="time", required=true)
    private BucketReplicationTimeValue time;

    public BucketReplicationTimeValue time() {
        return this.time;
    }

    private BucketReplicationTime() {}

    private BucketReplicationTime(BucketReplicationTime $) {
        this.status = $.status;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationTime $;

        public Builder() {
            $ = new BucketReplicationTime();
        }

        public Builder(BucketReplicationTime defaults) {
            $ = new BucketReplicationTime(Objects.requireNonNull(defaults));
        }

        public Builder status(BucketReplicationTimeStatus status) {
            $.status = status;
            return this;
        }

        public Builder time(BucketReplicationTimeValue time) {
            $.time = time;
            return this;
        }

        public BucketReplicationTime build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.time = Objects.requireNonNull($.time, "expected parameter 'time' to be non-null");
            return $;
        }
    }

}
