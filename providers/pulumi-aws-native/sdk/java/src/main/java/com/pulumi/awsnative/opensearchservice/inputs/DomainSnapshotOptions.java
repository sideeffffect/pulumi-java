// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainSnapshotOptions extends com.pulumi.resources.InvokeArgs {

    public static final DomainSnapshotOptions Empty = new DomainSnapshotOptions();

    @Import(name="automatedSnapshotStartHour")
    private @Nullable Integer automatedSnapshotStartHour;

    public Optional<Integer> automatedSnapshotStartHour() {
        return Optional.ofNullable(this.automatedSnapshotStartHour);
    }

    private DomainSnapshotOptions() {}

    private DomainSnapshotOptions(DomainSnapshotOptions $) {
        this.automatedSnapshotStartHour = $.automatedSnapshotStartHour;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainSnapshotOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainSnapshotOptions $;

        public Builder() {
            $ = new DomainSnapshotOptions();
        }

        public Builder(DomainSnapshotOptions defaults) {
            $ = new DomainSnapshotOptions(Objects.requireNonNull(defaults));
        }

        public Builder automatedSnapshotStartHour(@Nullable Integer automatedSnapshotStartHour) {
            $.automatedSnapshotStartHour = automatedSnapshotStartHour;
            return this;
        }

        public DomainSnapshotOptions build() {
            return $;
        }
    }

}
