// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.ClusteringResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.DestinationTablePropertiesResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.EncryptionConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.HivePartitioningOptionsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ParquetOptionsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RangePartitioningResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableSchemaResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TimePartitioningResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobConfigurationLoadResponse {
    /**
     * [Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. Only applicable to CSV, ignored for other formats.
     * 
     */
    private final Boolean allowJaggedRows;
    /**
     * Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
     * 
     */
    private final Boolean allowQuotedNewlines;
    /**
     * [Optional] Indicates if we should automatically infer the options and schema for CSV and JSON sources.
     * 
     */
    private final Boolean autodetect;
    /**
     * [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    private final ClusteringResponse clustering;
    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    private final String createDisposition;
    /**
     * [Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is ["NUMERIC", "BIGNUMERIC"]. If (precision,scale) is: (38,9) -> NUMERIC; (39,9) -> BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -> BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -> BIGNUMERIC; (77,38) -> BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, ["BIGNUMERIC", "NUMERIC"] is the same as ["NUMERIC", "BIGNUMERIC"] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to ["NUMERIC", "STRING"] for ORC and ["NUMERIC"] for the other file formats.
     * 
     */
    private final List<String> decimalTargetTypes;
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    private final EncryptionConfigurationResponse destinationEncryptionConfiguration;
    /**
     * [Required] The destination table to load the data into.
     * 
     */
    private final TableReferenceResponse destinationTable;
    /**
     * [Beta] [Optional] Properties with which to create the destination table if it is new.
     * 
     */
    private final DestinationTablePropertiesResponse destinationTableProperties;
    /**
     * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
     * 
     */
    private final String encoding;
    /**
     * [Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single-byte character. To use a character in the range 128-255, you must encode the character as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
     * 
     */
    private final String fieldDelimiter;
    /**
     * [Optional] Options to configure hive partitioning support.
     * 
     */
    private final HivePartitioningOptionsResponse hivePartitioningOptions;
    /**
     * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names
     * 
     */
    private final Boolean ignoreUnknownValues;
    /**
     * [Optional] If sourceFormat is set to newline-delimited JSON, indicates whether it should be processed as a JSON variant such as GeoJSON. For a sourceFormat other than JSON, omit this field. If the sourceFormat is newline-delimited JSON: - for newline-delimited GeoJSON: set to GEOJSON.
     * 
     */
    private final String jsonExtension;
    /**
     * [Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV and JSON. The default value is 0, which requires that all records are valid.
     * 
     */
    private final Integer maxBadRecords;
    /**
     * [Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify "\N", BigQuery interprets "\N" as a null value when loading a CSV file. The default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string is present for all data types except for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.
     * 
     */
    private final String nullMarker;
    /**
     * [Optional] Options to configure parquet support.
     * 
     */
    private final ParquetOptionsResponse parquetOptions;
    /**
     * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are case sensitive and must be top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in the Cloud Datastore backup, an invalid error is returned in the job result.
     * 
     */
    private final List<String> projectionFields;
    /**
     * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
     * 
     */
    private final String quote;
    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    private final RangePartitioningResponse rangePartitioning;
    /**
     * [Optional] The schema for the destination table. The schema can be omitted if the destination table already exists, or if you're loading data from Google Cloud Datastore.
     * 
     */
    private final TableSchemaResponse schema;
    /**
     * Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    private final List<String> schemaUpdateOptions;
    /**
     * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped.
     * 
     */
    private final Integer skipLeadingRows;
    /**
     * [Optional] The format of the data files. For CSV files, specify "CSV". For datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON, specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". For parquet, specify "PARQUET". For orc, specify "ORC". The default value is CSV.
     * 
     */
    private final String sourceFormat;
    /**
     * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups: Exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
     * 
     */
    private final List<String> sourceUris;
    /**
     * Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    private final TimePartitioningResponse timePartitioning;
    /**
     * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
     * 
     */
    private final Boolean useAvroLogicalTypes;
    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    private final String writeDisposition;

    @OutputCustomType.Constructor
    private JobConfigurationLoadResponse(
        @OutputCustomType.Parameter("allowJaggedRows") Boolean allowJaggedRows,
        @OutputCustomType.Parameter("allowQuotedNewlines") Boolean allowQuotedNewlines,
        @OutputCustomType.Parameter("autodetect") Boolean autodetect,
        @OutputCustomType.Parameter("clustering") ClusteringResponse clustering,
        @OutputCustomType.Parameter("createDisposition") String createDisposition,
        @OutputCustomType.Parameter("decimalTargetTypes") List<String> decimalTargetTypes,
        @OutputCustomType.Parameter("destinationEncryptionConfiguration") EncryptionConfigurationResponse destinationEncryptionConfiguration,
        @OutputCustomType.Parameter("destinationTable") TableReferenceResponse destinationTable,
        @OutputCustomType.Parameter("destinationTableProperties") DestinationTablePropertiesResponse destinationTableProperties,
        @OutputCustomType.Parameter("encoding") String encoding,
        @OutputCustomType.Parameter("fieldDelimiter") String fieldDelimiter,
        @OutputCustomType.Parameter("hivePartitioningOptions") HivePartitioningOptionsResponse hivePartitioningOptions,
        @OutputCustomType.Parameter("ignoreUnknownValues") Boolean ignoreUnknownValues,
        @OutputCustomType.Parameter("jsonExtension") String jsonExtension,
        @OutputCustomType.Parameter("maxBadRecords") Integer maxBadRecords,
        @OutputCustomType.Parameter("nullMarker") String nullMarker,
        @OutputCustomType.Parameter("parquetOptions") ParquetOptionsResponse parquetOptions,
        @OutputCustomType.Parameter("projectionFields") List<String> projectionFields,
        @OutputCustomType.Parameter("quote") String quote,
        @OutputCustomType.Parameter("rangePartitioning") RangePartitioningResponse rangePartitioning,
        @OutputCustomType.Parameter("schema") TableSchemaResponse schema,
        @OutputCustomType.Parameter("schemaUpdateOptions") List<String> schemaUpdateOptions,
        @OutputCustomType.Parameter("skipLeadingRows") Integer skipLeadingRows,
        @OutputCustomType.Parameter("sourceFormat") String sourceFormat,
        @OutputCustomType.Parameter("sourceUris") List<String> sourceUris,
        @OutputCustomType.Parameter("timePartitioning") TimePartitioningResponse timePartitioning,
        @OutputCustomType.Parameter("useAvroLogicalTypes") Boolean useAvroLogicalTypes,
        @OutputCustomType.Parameter("writeDisposition") String writeDisposition) {
        this.allowJaggedRows = allowJaggedRows;
        this.allowQuotedNewlines = allowQuotedNewlines;
        this.autodetect = autodetect;
        this.clustering = clustering;
        this.createDisposition = createDisposition;
        this.decimalTargetTypes = decimalTargetTypes;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.destinationTableProperties = destinationTableProperties;
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.hivePartitioningOptions = hivePartitioningOptions;
        this.ignoreUnknownValues = ignoreUnknownValues;
        this.jsonExtension = jsonExtension;
        this.maxBadRecords = maxBadRecords;
        this.nullMarker = nullMarker;
        this.parquetOptions = parquetOptions;
        this.projectionFields = projectionFields;
        this.quote = quote;
        this.rangePartitioning = rangePartitioning;
        this.schema = schema;
        this.schemaUpdateOptions = schemaUpdateOptions;
        this.skipLeadingRows = skipLeadingRows;
        this.sourceFormat = sourceFormat;
        this.sourceUris = sourceUris;
        this.timePartitioning = timePartitioning;
        this.useAvroLogicalTypes = useAvroLogicalTypes;
        this.writeDisposition = writeDisposition;
    }

    /**
     * [Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. Only applicable to CSV, ignored for other formats.
     * 
    */
    public Boolean getAllowJaggedRows() {
        return this.allowJaggedRows;
    }
    /**
     * Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
     * 
    */
    public Boolean getAllowQuotedNewlines() {
        return this.allowQuotedNewlines;
    }
    /**
     * [Optional] Indicates if we should automatically infer the options and schema for CSV and JSON sources.
     * 
    */
    public Boolean getAutodetect() {
        return this.autodetect;
    }
    /**
     * [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
    */
    public ClusteringResponse getClustering() {
        return this.clustering;
    }
    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
    */
    public String getCreateDisposition() {
        return this.createDisposition;
    }
    /**
     * [Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is ["NUMERIC", "BIGNUMERIC"]. If (precision,scale) is: (38,9) -> NUMERIC; (39,9) -> BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -> BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -> BIGNUMERIC; (77,38) -> BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, ["BIGNUMERIC", "NUMERIC"] is the same as ["NUMERIC", "BIGNUMERIC"] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to ["NUMERIC", "STRING"] for ORC and ["NUMERIC"] for the other file formats.
     * 
    */
    public List<String> getDecimalTargetTypes() {
        return this.decimalTargetTypes;
    }
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
    */
    public EncryptionConfigurationResponse getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration;
    }
    /**
     * [Required] The destination table to load the data into.
     * 
    */
    public TableReferenceResponse getDestinationTable() {
        return this.destinationTable;
    }
    /**
     * [Beta] [Optional] Properties with which to create the destination table if it is new.
     * 
    */
    public DestinationTablePropertiesResponse getDestinationTableProperties() {
        return this.destinationTableProperties;
    }
    /**
     * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
     * 
    */
    public String getEncoding() {
        return this.encoding;
    }
    /**
     * [Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single-byte character. To use a character in the range 128-255, you must encode the character as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
     * 
    */
    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }
    /**
     * [Optional] Options to configure hive partitioning support.
     * 
    */
    public HivePartitioningOptionsResponse getHivePartitioningOptions() {
        return this.hivePartitioningOptions;
    }
    /**
     * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names
     * 
    */
    public Boolean getIgnoreUnknownValues() {
        return this.ignoreUnknownValues;
    }
    /**
     * [Optional] If sourceFormat is set to newline-delimited JSON, indicates whether it should be processed as a JSON variant such as GeoJSON. For a sourceFormat other than JSON, omit this field. If the sourceFormat is newline-delimited JSON: - for newline-delimited GeoJSON: set to GEOJSON.
     * 
    */
    public String getJsonExtension() {
        return this.jsonExtension;
    }
    /**
     * [Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV and JSON. The default value is 0, which requires that all records are valid.
     * 
    */
    public Integer getMaxBadRecords() {
        return this.maxBadRecords;
    }
    /**
     * [Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify "\N", BigQuery interprets "\N" as a null value when loading a CSV file. The default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string is present for all data types except for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.
     * 
    */
    public String getNullMarker() {
        return this.nullMarker;
    }
    /**
     * [Optional] Options to configure parquet support.
     * 
    */
    public ParquetOptionsResponse getParquetOptions() {
        return this.parquetOptions;
    }
    /**
     * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are case sensitive and must be top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in the Cloud Datastore backup, an invalid error is returned in the job result.
     * 
    */
    public List<String> getProjectionFields() {
        return this.projectionFields;
    }
    /**
     * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
     * 
    */
    public String getQuote() {
        return this.quote;
    }
    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
    */
    public RangePartitioningResponse getRangePartitioning() {
        return this.rangePartitioning;
    }
    /**
     * [Optional] The schema for the destination table. The schema can be omitted if the destination table already exists, or if you're loading data from Google Cloud Datastore.
     * 
    */
    public TableSchemaResponse getSchema() {
        return this.schema;
    }
    /**
     * Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
    */
    public List<String> getSchemaUpdateOptions() {
        return this.schemaUpdateOptions;
    }
    /**
     * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped.
     * 
    */
    public Integer getSkipLeadingRows() {
        return this.skipLeadingRows;
    }
    /**
     * [Optional] The format of the data files. For CSV files, specify "CSV". For datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON, specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". For parquet, specify "PARQUET". For orc, specify "ORC". The default value is CSV.
     * 
    */
    public String getSourceFormat() {
        return this.sourceFormat;
    }
    /**
     * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups: Exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
     * 
    */
    public List<String> getSourceUris() {
        return this.sourceUris;
    }
    /**
     * Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
    */
    public TimePartitioningResponse getTimePartitioning() {
        return this.timePartitioning;
    }
    /**
     * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
     * 
    */
    public Boolean getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes;
    }
    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
    */
    public String getWriteDisposition() {
        return this.writeDisposition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationLoadResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowJaggedRows;
        private Boolean allowQuotedNewlines;
        private Boolean autodetect;
        private ClusteringResponse clustering;
        private String createDisposition;
        private List<String> decimalTargetTypes;
        private EncryptionConfigurationResponse destinationEncryptionConfiguration;
        private TableReferenceResponse destinationTable;
        private DestinationTablePropertiesResponse destinationTableProperties;
        private String encoding;
        private String fieldDelimiter;
        private HivePartitioningOptionsResponse hivePartitioningOptions;
        private Boolean ignoreUnknownValues;
        private String jsonExtension;
        private Integer maxBadRecords;
        private String nullMarker;
        private ParquetOptionsResponse parquetOptions;
        private List<String> projectionFields;
        private String quote;
        private RangePartitioningResponse rangePartitioning;
        private TableSchemaResponse schema;
        private List<String> schemaUpdateOptions;
        private Integer skipLeadingRows;
        private String sourceFormat;
        private List<String> sourceUris;
        private TimePartitioningResponse timePartitioning;
        private Boolean useAvroLogicalTypes;
        private String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationLoadResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.autodetect = defaults.autodetect;
    	      this.clustering = defaults.clustering;
    	      this.createDisposition = defaults.createDisposition;
    	      this.decimalTargetTypes = defaults.decimalTargetTypes;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.destinationTableProperties = defaults.destinationTableProperties;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.hivePartitioningOptions = defaults.hivePartitioningOptions;
    	      this.ignoreUnknownValues = defaults.ignoreUnknownValues;
    	      this.jsonExtension = defaults.jsonExtension;
    	      this.maxBadRecords = defaults.maxBadRecords;
    	      this.nullMarker = defaults.nullMarker;
    	      this.parquetOptions = defaults.parquetOptions;
    	      this.projectionFields = defaults.projectionFields;
    	      this.quote = defaults.quote;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.schema = defaults.schema;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
    	      this.sourceFormat = defaults.sourceFormat;
    	      this.sourceUris = defaults.sourceUris;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder allowJaggedRows(Boolean allowJaggedRows) {
            this.allowJaggedRows = Objects.requireNonNull(allowJaggedRows);
            return this;
        }

        public Builder allowQuotedNewlines(Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Objects.requireNonNull(allowQuotedNewlines);
            return this;
        }

        public Builder autodetect(Boolean autodetect) {
            this.autodetect = Objects.requireNonNull(autodetect);
            return this;
        }

        public Builder clustering(ClusteringResponse clustering) {
            this.clustering = Objects.requireNonNull(clustering);
            return this;
        }

        public Builder createDisposition(String createDisposition) {
            this.createDisposition = Objects.requireNonNull(createDisposition);
            return this;
        }

        public Builder decimalTargetTypes(List<String> decimalTargetTypes) {
            this.decimalTargetTypes = Objects.requireNonNull(decimalTargetTypes);
            return this;
        }

        public Builder destinationEncryptionConfiguration(EncryptionConfigurationResponse destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Objects.requireNonNull(destinationEncryptionConfiguration);
            return this;
        }

        public Builder destinationTable(TableReferenceResponse destinationTable) {
            this.destinationTable = Objects.requireNonNull(destinationTable);
            return this;
        }

        public Builder destinationTableProperties(DestinationTablePropertiesResponse destinationTableProperties) {
            this.destinationTableProperties = Objects.requireNonNull(destinationTableProperties);
            return this;
        }

        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
            return this;
        }

        public Builder hivePartitioningOptions(HivePartitioningOptionsResponse hivePartitioningOptions) {
            this.hivePartitioningOptions = Objects.requireNonNull(hivePartitioningOptions);
            return this;
        }

        public Builder ignoreUnknownValues(Boolean ignoreUnknownValues) {
            this.ignoreUnknownValues = Objects.requireNonNull(ignoreUnknownValues);
            return this;
        }

        public Builder jsonExtension(String jsonExtension) {
            this.jsonExtension = Objects.requireNonNull(jsonExtension);
            return this;
        }

        public Builder maxBadRecords(Integer maxBadRecords) {
            this.maxBadRecords = Objects.requireNonNull(maxBadRecords);
            return this;
        }

        public Builder nullMarker(String nullMarker) {
            this.nullMarker = Objects.requireNonNull(nullMarker);
            return this;
        }

        public Builder parquetOptions(ParquetOptionsResponse parquetOptions) {
            this.parquetOptions = Objects.requireNonNull(parquetOptions);
            return this;
        }

        public Builder projectionFields(List<String> projectionFields) {
            this.projectionFields = Objects.requireNonNull(projectionFields);
            return this;
        }

        public Builder quote(String quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }

        public Builder rangePartitioning(RangePartitioningResponse rangePartitioning) {
            this.rangePartitioning = Objects.requireNonNull(rangePartitioning);
            return this;
        }

        public Builder schema(TableSchemaResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder schemaUpdateOptions(List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = Objects.requireNonNull(schemaUpdateOptions);
            return this;
        }

        public Builder skipLeadingRows(Integer skipLeadingRows) {
            this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
            return this;
        }

        public Builder sourceFormat(String sourceFormat) {
            this.sourceFormat = Objects.requireNonNull(sourceFormat);
            return this;
        }

        public Builder sourceUris(List<String> sourceUris) {
            this.sourceUris = Objects.requireNonNull(sourceUris);
            return this;
        }

        public Builder timePartitioning(TimePartitioningResponse timePartitioning) {
            this.timePartitioning = Objects.requireNonNull(timePartitioning);
            return this;
        }

        public Builder useAvroLogicalTypes(Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes);
            return this;
        }

        public Builder writeDisposition(String writeDisposition) {
            this.writeDisposition = Objects.requireNonNull(writeDisposition);
            return this;
        }
        public JobConfigurationLoadResponse build() {
            return new JobConfigurationLoadResponse(allowJaggedRows, allowQuotedNewlines, autodetect, clustering, createDisposition, decimalTargetTypes, destinationEncryptionConfiguration, destinationTable, destinationTableProperties, encoding, fieldDelimiter, hivePartitioningOptions, ignoreUnknownValues, jsonExtension, maxBadRecords, nullMarker, parquetOptions, projectionFields, quote, rangePartitioning, schema, schemaUpdateOptions, skipLeadingRows, sourceFormat, sourceUris, timePartitioning, useAvroLogicalTypes, writeDisposition);
        }
    }
}
