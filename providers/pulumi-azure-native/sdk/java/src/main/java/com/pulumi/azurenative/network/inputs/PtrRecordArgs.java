// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A PTR record.
 * 
 */
public final class PtrRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final PtrRecordArgs Empty = new PtrRecordArgs();

    /**
     * The PTR target domain name for this PTR record.
     * 
     */
    @Import(name="ptrdname")
    private @Nullable Output<String> ptrdname;

    public Optional<Output<String>> ptrdname() {
        return Optional.ofNullable(this.ptrdname);
    }

    private PtrRecordArgs() {}

    private PtrRecordArgs(PtrRecordArgs $) {
        this.ptrdname = $.ptrdname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PtrRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PtrRecordArgs $;

        public Builder() {
            $ = new PtrRecordArgs();
        }

        public Builder(PtrRecordArgs defaults) {
            $ = new PtrRecordArgs(Objects.requireNonNull(defaults));
        }

        public Builder ptrdname(@Nullable Output<String> ptrdname) {
            $.ptrdname = ptrdname;
            return this;
        }

        public Builder ptrdname(String ptrdname) {
            return ptrdname(Output.of(ptrdname));
        }

        public PtrRecordArgs build() {
            return $;
        }
    }

}
