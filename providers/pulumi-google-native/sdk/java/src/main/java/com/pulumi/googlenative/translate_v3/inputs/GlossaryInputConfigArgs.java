// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.translate_v3.inputs.GcsSourceArgs;
import java.util.Objects;


/**
 * Input configuration for glossaries.
 * 
 */
public final class GlossaryInputConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlossaryInputConfigArgs Empty = new GlossaryInputConfigArgs();

    /**
     * Google Cloud Storage location of glossary data. File format is determined based on the filename extension. API returns [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file formats. Wildcards are not allowed. This must be a single file in one of the following formats: For unidirectional glossaries: - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated. The first column is source text. The second column is target text. The file must not contain headers. That is, the first row is data, not column names. - TMX (`.tmx`): TMX file with parallel data defining source/target term pairs. For equivalent term sets glossaries: - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms in multiple languages. See documentation for more information - [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
     * 
     */
    @Import(name="gcsSource", required=true)
    private Output<GcsSourceArgs> gcsSource;

    public Output<GcsSourceArgs> gcsSource() {
        return this.gcsSource;
    }

    private GlossaryInputConfigArgs() {}

    private GlossaryInputConfigArgs(GlossaryInputConfigArgs $) {
        this.gcsSource = $.gcsSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlossaryInputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlossaryInputConfigArgs $;

        public Builder() {
            $ = new GlossaryInputConfigArgs();
        }

        public Builder(GlossaryInputConfigArgs defaults) {
            $ = new GlossaryInputConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder gcsSource(Output<GcsSourceArgs> gcsSource) {
            $.gcsSource = gcsSource;
            return this;
        }

        public Builder gcsSource(GcsSourceArgs gcsSource) {
            return gcsSource(Output.of(gcsSource));
        }

        public GlossaryInputConfigArgs build() {
            $.gcsSource = Objects.requireNonNull($.gcsSource, "expected parameter 'gcsSource' to be non-null");
            return $;
        }
    }

}
