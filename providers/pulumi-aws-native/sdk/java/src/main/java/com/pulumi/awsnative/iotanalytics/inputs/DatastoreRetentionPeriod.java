// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreRetentionPeriod extends com.pulumi.resources.InvokeArgs {

    public static final DatastoreRetentionPeriod Empty = new DatastoreRetentionPeriod();

    @Import(name="numberOfDays")
    private @Nullable Integer numberOfDays;

    public Optional<Integer> numberOfDays() {
        return Optional.ofNullable(this.numberOfDays);
    }

    @Import(name="unlimited")
    private @Nullable Boolean unlimited;

    public Optional<Boolean> unlimited() {
        return Optional.ofNullable(this.unlimited);
    }

    private DatastoreRetentionPeriod() {}

    private DatastoreRetentionPeriod(DatastoreRetentionPeriod $) {
        this.numberOfDays = $.numberOfDays;
        this.unlimited = $.unlimited;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastoreRetentionPeriod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastoreRetentionPeriod $;

        public Builder() {
            $ = new DatastoreRetentionPeriod();
        }

        public Builder(DatastoreRetentionPeriod defaults) {
            $ = new DatastoreRetentionPeriod(Objects.requireNonNull(defaults));
        }

        public Builder numberOfDays(@Nullable Integer numberOfDays) {
            $.numberOfDays = numberOfDays;
            return this;
        }

        public Builder unlimited(@Nullable Boolean unlimited) {
            $.unlimited = unlimited;
            return this;
        }

        public DatastoreRetentionPeriod build() {
            return $;
        }
    }

}
