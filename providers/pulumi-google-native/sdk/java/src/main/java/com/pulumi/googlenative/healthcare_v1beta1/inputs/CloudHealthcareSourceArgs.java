// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cloud Healthcare API resource.
 * 
 */
public final class CloudHealthcareSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudHealthcareSourceArgs Empty = new CloudHealthcareSourceArgs();

    /**
     * Full path of a Cloud Healthcare API resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private CloudHealthcareSourceArgs() {}

    private CloudHealthcareSourceArgs(CloudHealthcareSourceArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudHealthcareSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudHealthcareSourceArgs $;

        public Builder() {
            $ = new CloudHealthcareSourceArgs();
        }

        public Builder(CloudHealthcareSourceArgs defaults) {
            $ = new CloudHealthcareSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CloudHealthcareSourceArgs build() {
            return $;
        }
    }

}
