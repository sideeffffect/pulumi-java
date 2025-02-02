// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceTypeInferenceAccelerator extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypeInferenceAccelerator Empty = new GetInstanceTypeInferenceAccelerator();

    @Import(name="count", required=true)
    private Integer count;

    public Integer count() {
        return this.count;
    }

    @Import(name="manufacturer", required=true)
    private String manufacturer;

    public String manufacturer() {
        return this.manufacturer;
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetInstanceTypeInferenceAccelerator() {}

    private GetInstanceTypeInferenceAccelerator(GetInstanceTypeInferenceAccelerator $) {
        this.count = $.count;
        this.manufacturer = $.manufacturer;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypeInferenceAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypeInferenceAccelerator $;

        public Builder() {
            $ = new GetInstanceTypeInferenceAccelerator();
        }

        public Builder(GetInstanceTypeInferenceAccelerator defaults) {
            $ = new GetInstanceTypeInferenceAccelerator(Objects.requireNonNull(defaults));
        }

        public Builder count(Integer count) {
            $.count = count;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            $.manufacturer = manufacturer;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetInstanceTypeInferenceAccelerator build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.manufacturer = Objects.requireNonNull($.manufacturer, "expected parameter 'manufacturer' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
